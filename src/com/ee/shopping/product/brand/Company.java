package com.ee.shopping.product.brand;

/**
 * To set company name. Some local product may not have company name
 * 
 * @author kriGow
 *
 */
public interface Company {
	void setCompanyName(String companyName);

	String getCompanyName(String companyName);

	/**
	 * To Set the Geo location. Sometimes product quality differs by location
	 * 
	 * @param name
	 */
	void setGeoLocation(String name);

	String getGeoLocation();
}
