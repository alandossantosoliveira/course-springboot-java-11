package com.estudandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
