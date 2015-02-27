package org.delta.services;

import org.delta.schemas.error.SDomainType;
import org.delta.schemas.error.SErrorCode;
import org.delta.schemas.error.TInquiryError;

public final class TInquiryErrorConverter {
//  public TInquiryError(
//    org.delta.schemas.error.SErrorCode errorCode,
//    java.lang.String errorDetail,
//    org.delta.schemas.error.SDomainType domainType) {
		
	public static TInquiryError convertToTInquiryError(Throwable e, SDomainType domainType) {
	  if ( e instanceof MissingParameterException )
        	return new TInquiryError(
      			SErrorCode.ERROR_INPUT,
      			e.getLocalizedMessage(),
      			domainType
      		);
	  else if ( e instanceof OperationException )
        	return new TInquiryError(
      			SErrorCode.ERROR_SERVER,
      			e.getLocalizedMessage(),
      			domainType
      		);
	  else if ( e instanceof UnknownCodeException )
        	return new TInquiryError(
      			SErrorCode.ERROR_DATA,
      			e.getLocalizedMessage(),
      			domainType
      		);
	  else
        	return new TInquiryError(
      			SErrorCode.ERROR_SERVER,
      			e.getMessage()==null?"":e.getMessage(),
      			domainType
      		);
	}

}
