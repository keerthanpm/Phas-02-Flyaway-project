package com.simplilear.flight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookinginfo")
public class BookingInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String btraveller;
	private float bprice;
	
	@OneToOne
	private UserDetails user;
	public BookingInfo() {
		
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBtraveller() {
		return btraveller;
	}
	public void setBtraveller(String btraveller) {
		this.btraveller = btraveller;
	}
	public float getBprice() {
		return bprice;
	}
	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public BookingInfo(String btraveller, float bprice, UserDetails user) {
		super();
		this.btraveller = btraveller;
		this.bprice = bprice;
		this.user = user;
	}
	
	
	
	
}
