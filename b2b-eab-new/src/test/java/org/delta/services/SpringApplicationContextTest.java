package org.sen.services;

import junit.framework.TestCase;

public class SpringApplicationContextTest extends TestCase {
	private String configLocation = "classpath:/applicationContextTest.xml";
	private String oldLocation = null;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		oldLocation = SpringApplicationContext.getConfigLocation();
		SpringApplicationContext.setConfigLocation(configLocation);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		SpringApplicationContext.setConfigLocation(oldLocation);
	}

	public void testGetBeanForEligibilityIVRFacade() throws Exception {
		assertNotNull("Must have eligibilityIVRFacade in context",
				SpringApplicationContext.getBean("eligibilityIVRFacade"));
	}
}
