package com.example.restaurantreview.data.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Restaurant{

	@SerializedName("customerReviews")
	private List<CustomerReviewsItem> customerReviews;

	@SerializedName("address")
	private String address;

	@SerializedName("pictureId")
	private String pictureId;

	@SerializedName("city")
	private String city;

	@SerializedName("name")
	private String name;

	@SerializedName("rating")
	private Object rating;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private String id;

	public List<CustomerReviewsItem> getCustomerReviews(){
		return customerReviews;
	}

	public String getAddress(){
		return address;
	}

	public String getPictureId(){
		return pictureId;
	}

	public String getCity(){
		return city;
	}

	public String getName(){
		return name;
	}

	public Object getRating(){
		return rating;
	}

	public String getDescription(){
		return description;
	}

	public String getId(){
		return id;
	}
}