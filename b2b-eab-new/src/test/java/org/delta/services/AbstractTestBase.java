package org.delta.services;

import org.delta.crossplane.common.test.AbstractSpringContextTests;

public class AbstractTestBase extends AbstractSpringContextTests {
	private String configLocation = "classpath:/applicationContextTest.xml";

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
                "applicationContextTest.xml"
        };
    }

	@Override
	protected void onSetUp() throws Exception {
		super.onSetUp();
		SpringApplicationContext.setConfigLocation(configLocation);
	}
}
