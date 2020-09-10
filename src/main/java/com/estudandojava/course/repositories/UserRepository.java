package com.estudandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
