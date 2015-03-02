package org.sen.crossplane.edifecs.dao;

import org.sen.crossplane.domain.EdifecsRequestResponse;

public interface EdifecsDao {
//	public String validateAndTransform(String ediRequest);
	public void validateAndTransform(EdifecsRequestResponse edifecsRequestResponse);
}
