package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	public void saveUser(Users user) {
		repository.save(user);
		System.out.println("User created" + user.getName());

	}
	public Iterable<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
