package com.springcore.firstspringcore.autowire;

public class Address {
	private String country;
	private String city;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}
	public Address() {
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + "]";
	}
	
}
