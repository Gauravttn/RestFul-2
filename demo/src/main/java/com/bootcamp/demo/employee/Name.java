package com.bootcamp.demo.employee;

public class Name {
	
	String fname,lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Name(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

}
