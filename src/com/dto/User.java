package com.dto;

public class User {
	private int bookingId;
	private int bookedSeats;
	private String deptDate;
	private String time;
	private String flightNo;
	private String name;
	private int contact;
	
	public User(){
		
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public String getDeptDate() {
		return deptDate;
	}
	public void setDeptDate(String deptDate) {
		this.deptDate = deptDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [bookingId=" + bookingId + ", bookedSeats=" + bookedSeats + ", deptDate=" + deptDate + ", time="
				+ time + ", flightNo=" + flightNo + ", name=" + name + ", contact=" + contact + "]";
	}
}
