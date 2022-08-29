package com.ekart.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ekart.entity.Product;
import com.ekart.exception.APIException;
import com.ekart.exception.ExceptionMessages;
import com.ekart.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		if (product == null) {
			throw new APIException(ExceptionMessages.PRODUCT_EMPTY, HttpStatus.BAD_REQUEST);
		}

		return productRepository.save(product);
	}

	@Override
	public List<Product> fetchProductList() {
		// TODO Auto-generated method stub
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public void deleteProductById(Long productId) {
		// TODO Auto-generated method stub
		Product tempProduct = productRepository.findById(productId).get();

		if (tempProduct == null) {
			throw new APIException(ExceptionMessages.PRODUCT_NOT_FOUND, HttpStatus.BAD_REQUEST);
		}

		productRepository.deleteById(productId);
		return;
	}

	@Override
	public Product updateProduct(Product product, Long productId) {
		// TODO Auto-generated method stub

		Product tempProduct = productRepository.findById(productId).get();

		if (tempProduct == null) {
			throw new APIException(ExceptionMessages.PRODUCT_NOT_FOUND, HttpStatus.BAD_REQUEST);
		}
		if (Objects.nonNull(tempProduct.getProductName()) && !"".equalsIgnoreCase(tempProduct.getProductName())) {
			tempProduct.setProductName(tempProduct.getProductName());
		}

		if (Objects.nonNull(tempProduct.getPrice())) {
			product.setPrice(product.getPrice());
		}

		return productRepository.save(product);

	}

}
