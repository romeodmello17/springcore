package com.springcore.firstspringcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> country; 
	private Map<String,Double> cost;
	public List<String> getCountry() {
		return country;
	}
	public void setCountry(List<String> country) {
		this.country = country;
	}
	public Map<String, Double> getCost() {
		return cost;
	}
	public void setCost(Map<String, Double> cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Person [country=" + country + ", cost=" + cost + "]";
	}
	
}
