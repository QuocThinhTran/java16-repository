package com.rest.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.backend.entity.User;
import com.rest.backend.exception.ElementNotFoundException;
import com.rest.backend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		return userRepository.findById(id)
				             .orElseThrow(() -> new ElementNotFoundException("User not found with id: " + id));
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(Integer id, User user) {
		User existingUser = userRepository.findById(id)
				                          .orElseThrow(() -> new ElementNotFoundException("User not found with id: " + id));
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		
		return userRepository.save(existingUser);
	}

	@Override
	public void deleteUser(Integer id) {
		User user = userRepository.findById(id)
				                  .orElseThrow(() -> new ElementNotFoundException("User not found with id: " + id));
		
		userRepository.delete(user);
	}              
}
