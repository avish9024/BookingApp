package com.alore.bookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alore.bookingApp.io.entity.HotelsEntity;
import com.alore.bookingApp.model.FilterModel;
import com.alore.bookingApp.service.BookingService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/searchHotels")
public class BookingAppController {
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping
	public List<HotelsEntity> searchHotels(@RequestBody FilterModel filter) {
		System.out.println("filter :::::::"+filter);
		return (List<HotelsEntity>) bookingService.searchHotels(filter);
	}
	

}
