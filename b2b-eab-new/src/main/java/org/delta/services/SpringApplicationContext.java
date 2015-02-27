package org.delta.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IVR is integrated to Spring application context
 * through this class.
 * 
 * @author Kin Kee
 * @since 1.1.0
 */
public class SpringApplicationContext {
	private static final Log logger = LogFactory.getLog(SpringApplicationContext.class);

	private static ApplicationContext applicationContext;
	// Default configuration location
	private static String configLocation = "classpath:/applicationContext.xml";
	
	/**
	 * Exposed for testability
	 * @param configLocation
	 */
	public static final void setConfigLocation(String configLocation) {
		SpringApplicationContext.configLocation = configLocation;
	}
	
	/**
	 * Exposed for testability
	 * @return
	 */
	public static final String getConfigLocation() {
		return SpringApplicationContext.configLocation;
	}
	
	/**
	 * Synchronize the creation of application context.
	 * @return
	 */
	private static ApplicationContext getContext() throws OperationException {
		synchronized (configLocation) {
			if (applicationContext == null) {
				logger.info("Loading Spring context file: " + configLocation);
				applicationContext = new ClassPathXmlApplicationContext(new String[]{configLocation});
			}
		}
		if (applicationContext == null) {
			throw new OperationException("Unable to load application context at: " + 
					configLocation);
		} else {
			logger.info("Spring application context loaded");
		}
		return applicationContext;
	}
	
	/**
	 * Instead of injection, use this method to 
	 * obtain a bean defined in Spring application
	 * context.
	 * 
	 * @param beanName
	 * @return
	 * @throws OperationException
	 */
	public static final Object getBean(String beanName) throws OperationException {
		logger.info("Looking up bean \"" + beanName + "\" in Spring application context");
		Object bean = getContext().getBean(beanName);
		if (bean != null) {
			logger.info("Found bean \"" + beanName + "\"");
			return bean;
		} else {
			logger.error("Bean \"" + beanName + "\" not found in Spring application context");
			throw new OperationException("Bean \"" + beanName + "\" not found in Spring application context");
		}
	}
}
