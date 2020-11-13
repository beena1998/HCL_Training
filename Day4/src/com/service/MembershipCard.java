package com.service;

public class MembershipCard extends Card {

	public MembershipCard(String holderName, String cardNumber, String expiryDate) {
		super(holderName, cardNumber, expiryDate);

	}

	private int rating;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
