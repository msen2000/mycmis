/**
 * EligibilityAndBenefitsServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.services.eligibilityAndBenefits;

public class EligibilityAndBenefitsServiceBindingStub extends org.apache.axis.client.Stub implements org.sen.services.eligibilityAndBenefits.EligibilityAndBenefitsServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getB2BEligibilityAndBenefits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "DOB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "FirstName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "LastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "PersonIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "EnrolleeIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "EnrolleeType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tContractListResponses"));
        oper.setReturnClass(org.sen.schemas.data.TContractListResponses.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "inquiryError"),
                      "org.sen.schemas.error.TInquiryError",
                      new javax.xml.namespace.QName("http://schemas.sen.org/error", "tInquiryError"), 
                      true
                     ));
        _operations[0] = oper;

    }

    public EligibilityAndBenefitsServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EligibilityAndBenefitsServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EligibilityAndBenefitsServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">B2BEligibilityAndBenefitsRequest");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.B2BEligibilityAndBenefitsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">B2BEligibilityAndBenefitsResponse");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.B2BEligibilityAndBenefitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">BenefitsInformation");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TNetworkTier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tNetworkTier");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "NetworkTier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">EligibilityInformation");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.EligibilityInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tBenefitPackage>deductibles");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TMaximumDeductible[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tMaximumDeductible");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "deductible");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tBenefitPackage>maximums");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TMaximumDeductible[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tMaximumDeductible");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "maximum");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tBenefitPackage>treatmentList");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TTreatment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tTreatment");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "treatment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tClaim>billingProvider");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TClaimBillingProvider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tClaim>claimStatus");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TClaimClaimStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tClaim>patient");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TClaimPatient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tCoverageDetail>coordinationOfBenefit");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TCoverageDetailCoordinationOfBenefit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tCoverageDetail>incentivePlan");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TCoverageDetailIncentivePlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tProcedureClass>procedureCodeList");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProcedureCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureCode");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "procedureCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tProviderContract>providerStatus");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProviderContractProviderStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tTreatment>procedureClassList");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProcedureClass[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureClass");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "procedureClass");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tTreatment>treatmentSummaries");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TTreatmentSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tTreatmentSummary");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "treatmentSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sAddressType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sClaimByIdResponseStatusType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SClaimByIdResponseStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sClaimListResponseStatusType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SClaimListResponseStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sClaimPredeterminationFlag");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SClaimPredeterminationFlag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sClaimType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SClaimType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sContractResponseStatusType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SContractResponseStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sCopaymentType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SCopaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sEnrolleeType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SEnrolleeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sLimitationQualifier");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SLimitationQualifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sPaymentStatusType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SPaymentStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sPaymentType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sPayToCode");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SPayToCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sPersonType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SPersonType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sPhoneType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SPhoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sProviderParticipationStatus");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SProviderParticipationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sProviderType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SProviderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sSearchResultType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SSearchResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sServiceLineExplanationCategoryType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SServiceLineExplanationCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sSpecialtyCode");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SSpecialtyCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sStatusType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sTimeUnitType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.STimeUnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "sToothSurfaceCodeType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.SToothSurfaceCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tAddress");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tAmountType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TAmountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBenefitClassCodeType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TBenefitClassCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBenefitInfo");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TBenefitInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBenefitPackage");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TBenefitPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBenefitPackageInquiryResponse");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TBenefitPackageInquiryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBusinessUnit");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TBusinessUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tClaim");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TClaim.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tClaimByIdResponse");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TClaimByIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tClaimList");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TClaim[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tClaim");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "claim");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tClaimListResponse");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TClaimListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tcoAmountType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TcoAmountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tContract");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TContract.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tContractList");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TContract[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tContract");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "contract");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tContractListResponse");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TContractListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tContractListResponses");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TContractListResponses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tCopayment");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TCopayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tCoverageDetail");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TCoverageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tDateRange");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TDateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tDivision");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TDivision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tEnrollee");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TEnrollee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tEnrolleeList");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TEnrollee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tEnrollee");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "enrollee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tException");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tExceptionType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TExceptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tExCode");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TExCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tFamilyIndividualType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TFamilyIndividualType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tGroup");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tGroupList");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tGroup");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "Group");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tLifeTimeAnnualType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TLifeTimeAnnualType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tLimitation");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TLimitation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tLineItem");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tMaximumDeductible");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TMaximumDeductible.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tNetworkTier");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TNetworkTier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tPayment");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tPerson");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tPhoneNumber");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TPhoneNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tPracticeLocation");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TPracticeLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureClass");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProcedureClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureCode");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProcedureCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureCodeAndName");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProcedureCodeAndName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureCodeAndNameList");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProcedureCodeAndName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureCodeAndName");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "procedureCodesAndNames");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProvider");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProvider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProviderContract");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProviderContract.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProviderInquiryResponse");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProviderInquiryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProviderList");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TProvider[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProvider");
            qName2 = new javax.xml.namespace.QName("http://schemas.sen.org/data", "provider");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tSecondaryProviderIdentifier");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TSecondaryProviderIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tSummaryPayment");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TSummaryPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tTreatment");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TTreatment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tTreatmentSummary");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TTreatmentSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/data", "tWaitingPeriod");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.data.TWaitingPeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/error", "sDomainType");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.error.SDomainType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/error", "sErrorCode");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.error.SErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/error", "tError");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.error.TError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.sen.org/error", "tInquiryError");
            cachedSerQNames.add(qName);
            cls = org.sen.schemas.error.TInquiryError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", ">B2BEligibilityAndBenefitsResponse");
            cachedSerQNames.add(qName);
            cls = org.sen.services.eligibilityAndBenefits.B2BEligibilityAndBenefitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", ">getB2BEligibilityAndBenefits");
            cachedSerQNames.add(qName);
            cls = org.sen.services.eligibilityAndBenefits.GetB2BEligibilityAndBenefits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.sen.schemas.data.TContractListResponses getB2BEligibilityAndBenefits(java.util.Date DOB, java.lang.String firstName, java.lang.String lastName, java.lang.String personIdentifier, java.lang.String enrolleeIdentifier, java.lang.String enrolleeType) throws java.rmi.RemoteException, org.sen.schemas.error.TInquiryError {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getB2BEligibilityAndBenefits");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "getB2BEligibilityAndBenefits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {DOB, firstName, lastName, personIdentifier, enrolleeIdentifier, enrolleeType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.sen.schemas.data.TContractListResponses) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.sen.schemas.data.TContractListResponses) org.apache.axis.utils.JavaUtils.convert(_resp, org.sen.schemas.data.TContractListResponses.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.sen.schemas.error.TInquiryError) {
              throw (org.sen.schemas.error.TInquiryError) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
