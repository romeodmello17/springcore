package com.springcore.firstspringcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Paneer {
	private String dish;

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		System.out.println("Setting paneer dish");
		this.dish = dish;
	}

	@Override
	public String toString() {
		return "Paneer [dish=" + dish + "]";
	}

	public Paneer() {
	}


	@PostConstruct
	public void init() {
		System.out.println("init Paneer");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy Paneer");
	}
}
