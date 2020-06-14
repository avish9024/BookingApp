package com.alore.bookingApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alore.bookingApp.io.entity.ReviewEntity;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewEntity, Long>{

	public ReviewEntity findByReviewId(String reviewid);
}
