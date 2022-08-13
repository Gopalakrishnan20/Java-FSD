package com.ecommerce;

public class Color {
	private long COLORID;
	private String name;

	public long getCOLORID() {
		return COLORID;
	}

	public void setCOLORID(long cOLORID) {
		COLORID = cOLORID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color() {
		super();
	}

	public Color(long cOLORID, String name) {
		super();
		COLORID = cOLORID;
		this.name = name;
	}

}
