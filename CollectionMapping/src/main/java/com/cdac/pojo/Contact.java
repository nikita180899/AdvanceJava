package com.cdac.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	
	private String emailid;
	private String mobileNum;
	public Contact() {
		super();
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	

}
