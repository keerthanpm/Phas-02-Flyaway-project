package com.simplilear.flight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetials")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private String uemail;
	private double umobnumber;
	private String usex;
	private String uaddress;
	private String upassword;
	
	public UserDetails() {
		
	}

	public UserDetails(String uname, String uemail, double umobnumber, String usex, String uaddress, String upassword) {
		super();
		this.uname = uname;
		this.uemail = uemail;
		this.umobnumber = umobnumber;
		this.usex = usex;
		this.uaddress = uaddress;
		this.upassword = upassword;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public double getUmobnumber() {
		return umobnumber;
	}

	public void setUmobnumber(double umobnumber) {
		this.umobnumber = umobnumber;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	@Override
	public String toString() {
		return "UserDetails [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", umobnumber=" + umobnumber
				+ ", usex=" + usex + ", uaddress=" + uaddress + ", upassword=" + upassword + "]";
	}

	
	
}
