package com.ashok.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ashok.it.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByuserName(String name);

	public List<User> findByuserAge(Integer age);
	
	public List<User> findByuserPhno(Integer phno);

	public List<User> findByUserAgeAndUserName(Integer age,String name);
	
	public List<User> findByuserAgeIn(List<Integer> age);
	
	@Query(value = "from User where userAge=:age")
	public List<User> getByAge(Integer age);
}
