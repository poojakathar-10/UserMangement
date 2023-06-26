package com.BikkadIT.CrudOperation.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	@NonNull
	private String uname;
	
	@NonNull
	private String uaddress;
	
	@NonNull
	private int uage;
	
	@NonNull
	private int mobileno;

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

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uaddress=" + uaddress + ", uage=" + uage + ", mobileno="
				+ mobileno + "]";
	}
	
	

	public User() {
		super();
	}

	public User(int uid, String uname, String uaddress, int uage, int mobileno) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uaddress = uaddress;
		this.uage = uage;
		this.mobileno = mobileno;
	}
	
	
	
	
	

}
