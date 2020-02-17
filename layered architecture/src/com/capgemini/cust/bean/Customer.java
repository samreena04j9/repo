package com.capgemini.cust.bean;

import java.sql.Date;

public class Customer {
	
	private int cid;
	private String customername;
	private double amount;
	private Date dop;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", customername=" + customername + ", amount=" + amount + ", dop=" + dop + "]";
	}

}
