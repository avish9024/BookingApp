package com.alore.bookingApp.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="reviews")
public class ReviewEntity implements Serializable{

	private static final long serialVersionUID = -8539549544890963748L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private String reviewId;
	
	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	@Column(nullable=false)
	private String userId;
	
	@Column(nullable=false)
    private String hotelId;
	
	@Column(nullable=false)
	private String reviewMsg;
	
	@Column(nullable=false)
	private int ratings;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
