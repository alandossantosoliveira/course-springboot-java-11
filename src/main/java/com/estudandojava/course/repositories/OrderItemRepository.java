package com.estudandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
