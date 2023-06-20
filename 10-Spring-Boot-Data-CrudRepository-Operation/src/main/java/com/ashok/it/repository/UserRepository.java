package com.ashok.it.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashok.it.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
