package com.app.model;

public class Project {
 private int prjId;
 private String prjCode;
 private double prjCost;
public Project() {
	super();
}
public int getPrjId() {
	return prjId;
}
public void setPrjId(int prjId) {
	this.prjId = prjId;
}
public String getPrjCode() {
	return prjCode;
}
public void setPrjCode(String prjCode) {
	this.prjCode = prjCode;
}
public double getPrjCost() {
	return prjCost;
}
public void setPrjCost(double prjCost) {
	this.prjCost = prjCost;
}
@Override
public String toString() {
	return "Project [prjId=" + prjId + ", prjCode=" + prjCode + ", prjCost=" + prjCost + "]";
}
 
}
