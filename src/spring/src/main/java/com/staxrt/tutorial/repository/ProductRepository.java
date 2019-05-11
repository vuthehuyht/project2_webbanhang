package com.staxrt.tutorial.repository;

import com.staxrt.tutorial.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 *
 * @author Givantha Kalansuriya
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}
