package com.simplilear.flight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="flight_details")
public class Flight_Details {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String flight_name;
	private String flight_from;
	private String flight_to;
	private float fprice;
	private String fdate;
	private String ftime;

	public Flight_Details(String flight_name, String flight_from, String flight_to, float fprice, String fdate,
			String ftime) {
		super();
		
		this.flight_name = flight_name;
		this.flight_from = flight_from;
		this.flight_to = flight_to;
		this.fprice = fprice;
		this.fdate = fdate;
		this.ftime = ftime;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getFlight_from() {
		return flight_from;
	}

	public void setFlight_from(String flight_from) {
		this.flight_from = flight_from;
	}

	public String getFlight_to() {
		return flight_to;
	}

	public void setFlight_to(String flight_to) {
		this.flight_to = flight_to;
	}

	public float getFprice() {
		return fprice;
	}

	public void setFprice(float fprice) {
		this.fprice = fprice;
	}

	public String getFdate() {
		return fdate;
	}

	public void setFdate(String fdate) {
		this.fdate = fdate;
	}

	public String getFtime() {
		return ftime;
	}

	public void setFtime(String ftime) {
		this.ftime = ftime;
	}

	public Flight_Details() {
		super();
	}

	@Override
	public String toString() {
		return "Flight_Details [fid=" + fid + ", flight_name=" + flight_name + ", flight_from=" + flight_from
				+ ", flight_to=" + flight_to + ", fprice=" + fprice + ", fdate=" + fdate + ", ftime=" + ftime + "]";
	}
	
	
	
	
}
