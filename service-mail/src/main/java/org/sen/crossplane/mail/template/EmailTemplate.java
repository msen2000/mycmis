package org.sen.crossplane.mail.template;

//import org.apache.commons.lang.StringUtils;

public enum EmailTemplate {
	OE_EN_APPROVAL_TEMPLATE("oe_en_approval_notification"), 
    OE_EN_REJECTED_TEMPLATE("oe_en_rejected_notification"), 
    OE_EN_MASS_TEMPLATE("oe_en_mass_notification"), 	 
	OE_BA_REMAINDER_TEMPLATE("oe_ba_remainder_notification"), 
	NOE_EN_PENDING_TEMPLATE("noe_en_pending_notification"), 	
	NOE_EN_APPROVAL_TEMPLATE("noe_en_approval_notification"), 
	NOE_EN_REJECTED_TEMPLATE("noe_en_rejected_notification"), 
	NOE_BA_PENDING_TEMPLATE("noe_ba_pending_notification"), 
	NOE_BA_REMAINDER_TEMPLATE("noe_ba_remainder_notification"), 
	FILE_PARSER_BG_PROCESS_TEMPLATE("file_parsing_notification"), 
	COMPARATOR_BG_PROCESS_TEMPLATE("comparator_process_notification"), 
	FILE_PARSER_PROCESS_COMP_TEMPLATE("file_parsing_comp_notification"), 
	COMPARATOR_PROCESS_COMP_TEMPLATE("comparator_process_comp_notification"),
	TEMPLATE_FILE_UPLOAD_NOTIFICATION_TEMPLATE("template_file_upload_notification"),
	SCHEMA_ACTIVATED_NOTIFICATION_TEMPLATE("schema_activated_notification"),
	APPROVAL_TEMPLATE("approval_notification"), 
	REJECTED_TEMPLATE("rejected_notification"), 
	OE_MASS_TEMPLATE("oe_mass_notification"), 
	JOB_FAILURE_TEMPLATE("job_failure_notification"), 
	BA_TEMPLATE("ba_notification"), 
	PFC_FEECAL_TEMPLATE("feecalc_notification"), 
	PFC_FEECAL_PROCESSED_TEMPLATE("feecalc_process_notification"), 
	PFC_FEECAL_ERROR_DNAC_TEMPLATE("feecalc_error_dnac_notification"),
	PFC_FEECAL_ERROR_OPERATION_TEMPLATE("feecalc_error_opn_notification"),
	PFC_FEECAL_MRT_REJECTED_TEMPLATE("feecalc_mrt_reject_notification"),
	FAX_APPROVAL_TEMPLATE("fax_notification"),
	FAX_EBD_APPROVAL_TEMPLATE("fax_ebd_notification"),
	FAX_UD_APPROVAL_TEMPLATE("fax_UD_notification");
	

	private String value;

	private EmailTemplate(String value) {
		this.value = value;
	}

	/**
	 * @return the display value for the template id.
	 */
	public String getValue() {
		return value;
	}

	public static final EmailTemplate fromString(String value) {
		if (null == value || value.trim().length()<=0)
			return null;
		value = value.trim();
		if (value.equalsIgnoreCase("oe_en_approval_notification")) {
			return OE_EN_APPROVAL_TEMPLATE;
		}
		if (value.equalsIgnoreCase("oe_en_rejected_notification")) {
			return OE_EN_REJECTED_TEMPLATE;
		}
		if (value.equalsIgnoreCase("oe_ba_remainder_notification")) {
			return OE_BA_REMAINDER_TEMPLATE;
		}
		if (value.equalsIgnoreCase("oe_en_mass_notification")) {
			return OE_EN_MASS_TEMPLATE;
		}		
		if (value.equalsIgnoreCase("noe_en_pending_notification")) {
			return NOE_EN_PENDING_TEMPLATE;
		}
		if (value.equalsIgnoreCase("noe_en_approval_notification")) {
			return NOE_EN_APPROVAL_TEMPLATE;
		}
		if (value.equalsIgnoreCase("noe_en_rejected_notification")) {
			return NOE_EN_REJECTED_TEMPLATE;
		}
		if (value.equalsIgnoreCase("noe_ba_pending_notification")) {
			return NOE_BA_PENDING_TEMPLATE;
		}
		if (value.equalsIgnoreCase("noe_ba_remainder_notification")) {
			return NOE_BA_REMAINDER_TEMPLATE;
		}
		if (value.equalsIgnoreCase("file_parsing_notification")) {
			return FILE_PARSER_BG_PROCESS_TEMPLATE;
		}
		if (value.equalsIgnoreCase("comparator_process_notification")) {
			return COMPARATOR_BG_PROCESS_TEMPLATE;
		}
		if (value.equalsIgnoreCase("file_parsing_comp_notification")) {
			return FILE_PARSER_PROCESS_COMP_TEMPLATE;
		}
		if (value.equalsIgnoreCase("comparator_process_comp_notification")) {
			return COMPARATOR_PROCESS_COMP_TEMPLATE;
		}
		if (value.equalsIgnoreCase("template_file_upload_notification")) {
			return TEMPLATE_FILE_UPLOAD_NOTIFICATION_TEMPLATE;
		}
		if (value.equalsIgnoreCase("schema_activated_notification")) {
			return SCHEMA_ACTIVATED_NOTIFICATION_TEMPLATE;
		}
		if (value.equalsIgnoreCase("approval_notification")) {
			return APPROVAL_TEMPLATE;
		}
		if (value.equalsIgnoreCase("rejected_notification")) {
			return REJECTED_TEMPLATE;
		}
		if (value.equalsIgnoreCase("oe_mass_notification")) {
			return OE_MASS_TEMPLATE;
		}
		if (value.equalsIgnoreCase("job_failure_notification")) {
			return JOB_FAILURE_TEMPLATE;
		}
		if (value.equalsIgnoreCase("ba_notification")) {
			return BA_TEMPLATE;
		}
		if (value.equalsIgnoreCase("feecalc_notification")) {
			return PFC_FEECAL_TEMPLATE;
		}
		if (value.equalsIgnoreCase("feecalc_process_notification")) {
			return PFC_FEECAL_PROCESSED_TEMPLATE;
		}
		if (value.equalsIgnoreCase("feecalc_error_dnac_notification")) {
			return PFC_FEECAL_ERROR_DNAC_TEMPLATE;
		}
		if (value.equalsIgnoreCase("feecalc_error_opn_notification")) {
			return PFC_FEECAL_ERROR_OPERATION_TEMPLATE;
		}
		if (value.equalsIgnoreCase("feecalc_mrt_reject_notification")) {
			return PFC_FEECAL_MRT_REJECTED_TEMPLATE;
		}
		if (value.equalsIgnoreCase("fax_notification")) {
			return FAX_APPROVAL_TEMPLATE;
		}
		if (value.equalsIgnoreCase("fax_ebd_notification")) {
			return FAX_EBD_APPROVAL_TEMPLATE;
		}
		if (value.equalsIgnoreCase("fax_UD_notification")) {
			return FAX_UD_APPROVAL_TEMPLATE;
		}

//		throw new Exception("Unknown template value \"" + value + "\"");
		return FAX_UD_APPROVAL_TEMPLATE;
	}
}
