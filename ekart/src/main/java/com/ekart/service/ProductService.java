package com.ekart.service;

import java.util.List;

import com.ekart.entity.Product;

/**
 * @author ujjwalk
 *
 */
public interface ProductService {

	// C - Create Operation
	Product saveProduct(Product product);

	// R - Read Operation
	List<Product> fetchProductList();

	// U - Update Operation
	Product updateProduct(Product product, Long productId);

	// D - Delete Operation
	void deleteProductById(Long productId);

}
