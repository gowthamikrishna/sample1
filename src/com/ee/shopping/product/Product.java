package com.ee.shopping.product;

import java.util.UUID;

/**
 * Model to capture basic product details and identify it uniquely
 * 
 * @author kriGow
 *
 */
public interface Product {
	void setProductCode(UUID code);

	UUID getProductCode();

	void setName(String name);

	String getName(String name);

	void setPrice(double price);

	double getPrice();
}
