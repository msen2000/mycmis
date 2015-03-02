/**
 * 
 */
package org.sen.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

/**
 * @author Edward Suryadi
 *
 */
public class IVRUtilTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link org.sen.services.IVRUtil#toSEnrolleeType(java.lang.String)}.
	 */
	public void testToSEnrolleeType() {
		// TODO
	}

	/**
	 * Test method for {@link org.sen.services.IVRUtil#isBirthDateInPrimaryEnrolleeContractList(java.util.List, java.util.Date)}.
	 */
	public void testIsBirthDateInPrimaryEnrolleeContractList() {
		// TODO
	}

	/**
	 * Test method for {@link org.sen.services.IVRUtil#getDoubleFromBigDecimal(java.math.BigDecimal)}.
	 */
	public void testGetDoubleFromBigDecimal() {
		// TODO
	}

	/**
	 * Test method for {@link org.sen.services.IVRUtil#convertToTInquiryError(java.lang.Throwable, org.sen.schemas.error.SDomainType)}.
	 */
	public void testConvertToTInquiryError() {
		// TODO
	}

	/**
	 * Test method for {@link org.sen.services.IVRUtil#isDateInSixMonth(java.util.Date)}.
	 */
	public void testIsDateInSixMonth() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String todayStr = df.format(new Date());
		
		Calendar today = Calendar.getInstance(); 
		today.setTime(df.parse(todayStr));
		assertTrue("Test Date today", IVRUtil.isDateInSixMonth(today.getTime()));
		
		Calendar threeMonthsAgo = Calendar.getInstance(); 
		threeMonthsAgo.setTime(df.parse(todayStr));
		threeMonthsAgo.add(Calendar.MONTH, -3);
		assertTrue("Test Date 3 Months Ago", IVRUtil.isDateInSixMonth(threeMonthsAgo.getTime()));
		
		Calendar sixMonthsAgo = Calendar.getInstance(); 
		sixMonthsAgo.setTime(df.parse(todayStr));
		sixMonthsAgo.add(Calendar.MONTH, -6);
		assertTrue("Test Date 6 Months Ago", IVRUtil.isDateInSixMonth(sixMonthsAgo.getTime()));
		
		Calendar nineMonthsAgo = Calendar.getInstance(); 
		nineMonthsAgo.setTime(df.parse(todayStr));
		nineMonthsAgo.add(Calendar.MONTH, -9);
		assertFalse("Test Date 9 Months Ago", IVRUtil.isDateInSixMonth(nineMonthsAgo.getTime()));
		
		Calendar threeMonthsLater = Calendar.getInstance(); 
		threeMonthsLater.setTime(df.parse(todayStr));
		threeMonthsLater.add(Calendar.MONTH, 3);
		assertFalse("Test Date 3 Months Later", IVRUtil.isDateInSixMonth(threeMonthsLater.getTime()));
	}

	/**
	 * Test method for {@link org.sen.services.IVRUtil#toSTimeUnitType(java.lang.String, int, java.lang.String)}.
	 */
	public void testToSTimeUnitType() {
		// TODO
	}

	/**
	 * Test method for {@link org.sen.services.IVRUtil#phoneTypeConverter(java.lang.String)}.
	 */
	public void testPhoneTypeConverter() {
		// TODO
	}

	/**
	 * Test method for {@link org.sen.services.IVRUtil#comparePeriodToToday(java.util.Date, java.util.Date)}.
	 */
	public void testComparePeriodToToday() {
		// TODO
	}

}
