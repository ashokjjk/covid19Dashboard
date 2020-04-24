package com.ashok.app.service;

import java.util.HashMap;
import java.util.Map;

public class Modeldata {

	private String State;
	private String Country;
	private int TotalCase;
	private int OldCase;

	public int getOldCase() {
		return OldCase;
	}

	public void setOldCase(int oldCase) {
		OldCase = oldCase;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getTotalCase() {
		return TotalCase;
	}

	public void setTotalCase(int totalCase) {
		TotalCase = totalCase;
	}

	public Map<String, String> statValues(){
		Map<String, String> val=new HashMap<String, String>();
		val.put("State", State);
		val.put("Country", Country);
		val.put("TotalCase", String.valueOf(TotalCase));
		val.put("OldCase", String.valueOf(OldCase));
		return val;
	}
	
}
