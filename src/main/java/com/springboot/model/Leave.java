package com.springboot.model;

import java.io.Serializable;

public class Leave implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String date;
	private int days;

	public Leave(String name, String date, int days) {
		super();
		this.name = name;
		this.date = date;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
}
