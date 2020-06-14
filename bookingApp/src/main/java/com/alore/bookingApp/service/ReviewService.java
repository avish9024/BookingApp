package com.alore.bookingApp.service;

import com.alore.bookingApp.model.AddReviewModel;

public interface ReviewService {

	public AddReviewModel addReview(AddReviewModel review);
	
	public void deleteReview(String reviewId);
}
