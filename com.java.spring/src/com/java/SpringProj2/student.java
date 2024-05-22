package com.java.SpringProj2;

public class student {
	private String studName;
	private int studId;
	
	
	public student(String studName, int studId) {
		super();
		this.studName = studName;
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	@Override
	public String toString() {
		return "student [studName=" + studName + ", studId=" + studId + ", getStudName()=" + getStudName()
				+ ", getStudId()=" + getStudId() + "]";
	}
	

}
