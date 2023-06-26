package com.rest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
