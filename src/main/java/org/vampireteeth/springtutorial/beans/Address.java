package org.vampireteeth.springtutorial.beans;

public class Address {

	private int number;
	private String street;
	private int postcode;
	
	
	public Address() {
	}
	public Address(int number, String street, int postcode) {
		this.number = number;
		this.street = street;
		this.postcode = postcode;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Address [number=" + number + ", street=" + street + ", postcode=" + postcode + "]";
	}
	
	
	public void onCreate() {
		System.out.println("Address.onCreate()");
	}
	
	public void onDestroy() {
		System.out.println("Address.onDestroy()");
	}
	
	
}
