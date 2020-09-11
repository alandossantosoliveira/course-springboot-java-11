package com.estudandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
