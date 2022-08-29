package com.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekart.entity.Product;

/**
 * @author ujjwalk
 *
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
