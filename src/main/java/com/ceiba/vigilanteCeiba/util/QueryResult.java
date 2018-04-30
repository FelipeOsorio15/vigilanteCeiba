package com.ceiba.vigilanteCeiba.util;

import java.util.List;

public class QueryResult {
	
	private int totalRegisters;
	private List<Object> list;
	
	public int getTotalRegisters() {
		return totalRegisters;
	}
	public void setTotalRegisters(int totalRegisters) {
		this.totalRegisters = totalRegisters;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}

}
