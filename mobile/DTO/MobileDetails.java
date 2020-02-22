package com.mobile.DTO;

public class MobileDetails {
	double number;
	String name;
	double price;
	String quantity;
	
	public MobileDetails(double number, String name, double price, String quantity) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "MobileDetails [number=" + number + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	public MobileDetails() {
		// TODO Auto-generated constructor stub
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
