package com.alore.bookingApp.service;

import java.util.List;

import com.alore.bookingApp.io.entity.HotelsEntity;
import com.alore.bookingApp.model.Hotels;

public interface HotelService {

	public Hotels addHotel(Hotels hotel);
	
	public void updateHotel(Hotels hotel);
	
	public Hotels deleteHotel(String hotelName);
	
	public List<HotelsEntity> getAllHotels();
}
