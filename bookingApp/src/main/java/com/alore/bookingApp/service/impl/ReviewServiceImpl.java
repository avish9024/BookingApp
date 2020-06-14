package com.alore.bookingApp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alore.bookingApp.io.entity.ReviewEntity;
import com.alore.bookingApp.model.AddReviewModel;
import com.alore.bookingApp.repository.ReviewRepository;
import com.alore.bookingApp.service.ReviewService;
import com.alore.bookingApp.utils.Utils;

@Service
public class ReviewServiceImpl implements ReviewService{

	private static final Logger logger = LoggerFactory.getLogger(ReviewServiceImpl.class);
	
	@Autowired
	ReviewRepository reviewRepository;
	
	@Autowired
	Utils utils;
	
	@Override
	public AddReviewModel addReview(AddReviewModel review) {
		
		ReviewEntity reviewEntity = new ReviewEntity();
		BeanUtils.copyProperties(review,reviewEntity);
		
		logger.info(reviewEntity.getUserId());
		String publicUserId = utils.generateUserId(38);
		reviewEntity.setReviewId(publicUserId);
		
		ReviewEntity storedReview = reviewRepository.save(reviewEntity);
		logger.info("stored review is {}", storedReview);
		
		AddReviewModel returnedValue = new AddReviewModel();
		BeanUtils.copyProperties(storedReview, returnedValue);
		return returnedValue;
	}

	@Override
	public void deleteReview(String reviewId) {
		ReviewEntity entity = reviewRepository.findByReviewId(reviewId);
		logger.info(reviewId);
		//logger.info(entity.getReviewId());
		if(entity != null) {
			reviewRepository.delete(entity);
		}
		
	}

}
