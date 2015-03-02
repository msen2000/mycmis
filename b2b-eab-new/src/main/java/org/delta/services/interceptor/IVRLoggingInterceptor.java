package org.sen.services.interceptor;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sen.crossplane.common.util.InputFilter;
import org.sen.services.OperationException;

import org.springframework.aop.ThrowsAdvice;

public class IVRLoggingInterceptor implements ThrowsAdvice {

	protected static final Log logger = LogFactory.getLog(IVRLoggingInterceptor.class);

	public void afterThrowing(Method method, Object[] args, Object target, Throwable ex) {
		String realtimeCode = "IVR-" + Long.toString(System.currentTimeMillis());
		StringBuffer argStr = new StringBuffer("");
		for (int i=0; i<args.length; i++)
			argStr.append(args[i] + ",");
		String errorMsg;
		if ( ex instanceof OperationException && ex.getCause() != null ) 
			errorMsg = ex.getCause().getMessage();
		else 
			errorMsg = ex.getMessage();
		logger.error("Realtime error code: " + realtimeCode + ". Failed to execute method: " + 
				method.getName() + "(" + InputFilter.encodeOutput(argStr.toString()) +"): " + errorMsg);
	}

}
