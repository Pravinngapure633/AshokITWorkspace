package com.ashok.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.it.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
