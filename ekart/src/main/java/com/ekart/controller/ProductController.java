package com.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ekart.entity.Product;
import com.ekart.service.ProductService;

/**
 * @author ujjwalk
 *
 */
@RestController
public class ProductController {

	// Annotation
	@Autowired
	private ProductService productService;

	// Save operation
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	// Read operation
	@GetMapping("/products")
	public List<Product> fetchProductsList() {
		return productService.fetchProductList();
	}

	// Update operation
	@PutMapping("/product/{id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable("id") Long productId) {
		return productService.updateProduct(product, productId);
	}

	// Delete operation
	@DeleteMapping("/product/{id}")
	public String deleteProductById(@PathVariable("id") Long productId) {
		productService.deleteProductById(productId);
		return "Deleted Successfully";
	}

}
