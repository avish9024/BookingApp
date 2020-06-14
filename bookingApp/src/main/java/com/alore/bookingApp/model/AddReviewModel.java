package com.alore.bookingApp.model;

public class AddReviewModel {

	private String userId;
	
	private String hotelId;
	
	private String reviewMsg;
	
	private int ratings;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getReviewMsg() {
		return reviewMsg;
	}

	public void setReviewMsg(String reviewMsg) {
		this.reviewMsg = reviewMsg;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	
}
