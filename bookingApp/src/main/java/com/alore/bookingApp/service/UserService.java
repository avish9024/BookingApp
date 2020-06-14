package com.alore.bookingApp.service;

import java.util.List;

import com.alore.bookingApp.io.entity.UserEntity;
import com.alore.bookingApp.model.User;
import com.alore.bookingApp.model.UserLoginModel;

public interface UserService {
	
	public User createUser(User user);
	
	public User deleteUser(String email);
	
	public void updateUser(User user);
	
	public User logIn(UserLoginModel loginModel);
	
	public List<UserEntity> getAllUser();
	

}
