package com.lhv.springbootmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhv.springbootmongodb.domain.User;
import com.lhv.springbootmongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;	
	public List<User> findAll(){
		return repo.findAll();
	}
}
