package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.User;
import com.example.demo.repositories.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository urepo;
	public User adduser(User u) {
		return urepo.save(u);

}
	public User getuserInfo(int id) {
		return urepo.getById(id);
		
	}
}
