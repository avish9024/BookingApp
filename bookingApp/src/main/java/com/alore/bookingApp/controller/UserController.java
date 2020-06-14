package com.alore.bookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alore.bookingApp.io.entity.UserEntity;
import com.alore.bookingApp.model.AddReviewModel;
import com.alore.bookingApp.model.User;
import com.alore.bookingApp.model.UserLoginModel;
import com.alore.bookingApp.service.ReviewService;
import com.alore.bookingApp.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	ReviewService reviewService;
	
    @RequestMapping(value="/addUser",method = RequestMethod.POST)
	public User createUser(@RequestBody User  userDetails) {
		User createdUser = userService.createUser(userDetails);
		return createdUser;
		
	}
	
    @RequestMapping(value="/updateUser",method = RequestMethod.PUT)
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
		
	}
	
    @RequestMapping(value="/deleteUser",method = RequestMethod.DELETE)
	public User deleteUser(@RequestParam(value="email") String email) {
		return userService.deleteUser(email);
	}
    
    @RequestMapping(value="/getAll",method = RequestMethod.GET)
	public List<UserEntity> getAllUser() {
    	System.out.println("hiii");
		return (List<UserEntity>) userService.getAllUser();
	}
	
    @RequestMapping(value="/logIn",method = RequestMethod.POST)
	public User logIn(@RequestBody UserLoginModel loginModel) {
		User loggedInUser = userService.logIn(loginModel);
		return loggedInUser;
	}

    @RequestMapping(value="/addReview",method = RequestMethod.POST)
	public AddReviewModel addReview(@RequestBody AddReviewModel review) {
		return reviewService.addReview(review);
	}
	
	@RequestMapping(value="/deleteReview/{reviewId}",method = RequestMethod.DELETE)
	public void deleteReview(@PathVariable("reviewId") String reviewId) {
		reviewService.deleteReview(reviewId);
	}
}
