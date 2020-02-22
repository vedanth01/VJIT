package com.mobile.DTO;

import java.time.LocalDate;

public class PurchaseDetails {
	int purchaseId;
	String cname,mailId,phno;
	double mobileId;
	LocalDate purchaseDate;
	public PurchaseDetails(int purchaseId, String cname, String mailId, String phno, LocalDate purchaseDate,
			double mobileId) {
		super();
		this.purchaseId = purchaseId;
		this.cname = cname;
		this.mailId = mailId;
		this.phno = phno;
		this.purchaseDate = purchaseDate;
		this.mobileId = mobileId;
	}
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cename) {
		this.cname = cname;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public double getMobileId() {
		return mobileId;
	}
	public void setMobileId(double mobileId) {
		this.mobileId = mobileId;
	}
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
}