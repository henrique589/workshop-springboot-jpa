package com.henrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
