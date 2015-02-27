package org.delta.services;

import java.math.BigDecimal;
import java.security.InvalidParameterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.delta.crossplane.domain.enrollment.Enrollee;
import org.delta.crossplane.domain.enrollment.PrimaryEnrolleeContract;
import org.delta.schemas.data.SEnrolleeType;
import org.delta.schemas.data.STimeUnitType;

public class IVRUtil {
    private static final Log LOG =
        LogFactory.getLog(IVRUtil.class);

	private IVRUtil() {}
	public static SEnrolleeType toSEnrolleeType(String relation) {
		/*case SELF : return "Self";
		case SURVIVING_SPOUSE  : return "Subscriber";
		case CHILD_SUBSCRIBER  : return  "Self";
		case SPOUSE : return "Spouse" ;
		case  DOMESTIC_PARTNER : return "Domestic Partner";
		case CHILD : return "Child";
		case STUDENT : return "Student";
		case DISABLED_CHILD : return "Disabled Child";
		case IRS_DEPENDENT : return "IRS Dependent";
		case OTHER_ADULT  : return "Other Adult";*/
		if ( relation.equals("Child") || relation.equals("Student")
				|| relation.equals("Disabled Child") || relation.equals("IRS Dependent")
				|| relation.equals("Other Adult") )
			relation = "Dependent";
		
		SEnrolleeType enrolleeType = null;
		try {
			enrolleeType = SEnrolleeType.fromString(relation);
		}
		catch(IllegalArgumentException iae) {
			throw new UnknownCodeException("unrecognized relation code", "relationShipCode", relation);
		}
		
		return enrolleeType;
	}

	public static boolean isBirthDateInPrimaryEnrolleeContractList(List<PrimaryEnrolleeContract> contractList, Date enrolleeDob) {
		Date dob;
		PrimaryEnrolleeContract pc;
		
		//find primary enrollee dob match
		for ( Iterator<PrimaryEnrolleeContract> it = contractList.iterator(); it.hasNext(); ) {
			pc = it.next();
			dob = pc.getPrimaryEnrollee().getPerson().getPersonBirthDate();
			if ( DateUtils.isSameDay(dob, enrolleeDob) ) {
				return true;
			}
		}

		//find dependent dob match
		List<Enrollee> dependentList;
		Enrollee curEnrollee;
		for ( Iterator<PrimaryEnrolleeContract> it = contractList.iterator(); it.hasNext(); ) {
			pc = it.next();
			dependentList = pc.getDependentEnrollee();
			for (int i = 0; i < dependentList.size(); i++ ) {
				curEnrollee = dependentList.get(i);
				dob = curEnrollee.getPerson().getPersonBirthDate();
				if ( DateUtils.isSameDay(dob, enrolleeDob) ) {
					return true;
				}				
			}
		}
		
		return false;		
	}
		
	public static double getDoubleFromBigDecimal(BigDecimal amount) {
		if ( amount == null )
			return 0.00;
		else
			return amount.doubleValue();
	}
	
	public static boolean isDateInSixMonth(Date checkDate) {
		if ( checkDate == null ) {
			throw new InvalidParameterException("Date can not be null");
		}
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String todayStr = df.format(new Date());
		Calendar today = Calendar.getInstance();
		Calendar sixMonthAgo = Calendar.getInstance();
		try {
			today.setTime(df.parse(todayStr));
			sixMonthAgo.setTime(df.parse(todayStr));
			sixMonthAgo.add(Calendar.MONTH, -6);
		} catch (ParseException ex) {
			throw new IVRServiceException(ex.getMessage(), ex);
		}

		if ( checkDate.compareTo(today.getTime()) <= 0 && checkDate.compareTo(sixMonthAgo.getTime()) >= 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static STimeUnitType toSTimeUnitType(String timeUnitDescription, int intervalNumber, String periodType) {
		/*
		Business Rules:
		Business rule for mapping the eIVR 'S' (Date of Service) and 'D' (day period) frequency limitation time period units:
		1. If the Interval number is equal to 1 and interval unit description is 'days' map the IVR time period unit to 'S' 
		2. If interval number is greater than 1 and interval unit description is 'days' map the IVR time period unit to 'D' 
		 
		Business rule for mapping the eIVR 'C' (per Calendar year) frequency limitation time period unit:
		1. If Period Type Description is equal to 'Calendar' and interval unit description is ‘years’ map the IVR time period unit to 'C' 		
		
		case null : "L" (lifetime);
		case Months : "M";
		*/
		STimeUnitType unitType;
		String unitCode = null;
		if ( timeUnitDescription == null )
			unitCode = "L";
		else if ( timeUnitDescription.equalsIgnoreCase("Days") ) {
			if ( intervalNumber ==1 )
				unitCode = "S";
			else
				unitCode = "D";
		}
		else if ( timeUnitDescription.equalsIgnoreCase("Months") )
			unitCode = "M";
		else if ( timeUnitDescription.equalsIgnoreCase("Years") ) {
			if ( periodType != null && periodType.equalsIgnoreCase("Calendar") )
				unitCode = "C";
			else
				unitCode = "Y";
		}
		
		try {
			unitType = STimeUnitType.fromString(unitCode);
		}
		catch(IllegalArgumentException iae) {
			throw new UnknownCodeException("unrecognized timeUnitDescription", "timeUnitDescription", timeUnitDescription);
		}
		
		return unitType;
	}

	/*
	 * BackPlane provides phone types in CAPS letter. But the schema accepts values in small letter.
	 * Covert all CAPS values into small case values.
	 */
	public static String phoneTypeConverter(String phType) {
		phType = phType.toLowerCase();
		
		if ("home".equals(phType) ) {
			phType = "home";
		} else if ("office".equals(phType) ) {
			phType = "office";
		} else if ("fax".equals(phType) ) {
			phType = "fax";
		} else if ("other".equals(phType) ) {
			phType = "other";
		} else {
			phType = "other";
		}
		
		return phType;	
							
	}
	
	/**
	 * @param beginDate required
	 * @param endDate optional
	 * @return 
	 * -1: period is in the past
	 * 0: period is in the present
	 * 1: period is in the future
	 */
	public static int comparePeriodToToday(Date beginDate, Date endDate) {
		if ( beginDate == null )
			throw new IllegalArgumentException("begin Date can not be null");
		Date today = new Date();
		if ( today.before(org.delta.crossplane.common.util.DateUtils.endOfDay(beginDate)) )
				return 1;
		else { //today after begin date
			if ( endDate == null )
				return 0;
			else {
				if ( today.before(org.delta.crossplane.common.util.DateUtils.endOfDay(endDate)) )
					return 0;
				else
					return -1;
			}
		}	
	}

}
