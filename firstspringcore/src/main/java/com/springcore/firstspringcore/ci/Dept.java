package com.springcore.firstspringcore.ci;

public class Dept {
	private String deptname;

	public Dept(String deptname) {
		super();
		this.deptname = deptname;
	}

	@Override
	public String toString() {
		return "Dept [deptname=" + deptname + "]";
	}

}
