package com.sushil.spring.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import com.sushil.spring.bean.User;
public interface UserRepository extends CrudRepository<User, Long>,PagingAndSortingRepository<User, Long>, Repository<User, Long>
{

	User findByName(String name);
	

}
