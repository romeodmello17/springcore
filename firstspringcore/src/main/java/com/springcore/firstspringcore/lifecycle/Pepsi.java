package com.springcore.firstspringcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("property set pepsi");
		this.price = price;
	}

	public Pepsi(int price) {
		this.price = price;
	}

	public Pepsi() {
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init pepsi");
	}

	public void destroy() throws Exception {
		System.out.println("destroy pepsi");
	}


}
