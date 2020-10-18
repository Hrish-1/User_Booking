package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.conn.MyConn;
import com.dto.User;

public class UserDaoImple implements UserDao{
	
	MyConn myConn;
	
	public UserDaoImple(){
		myConn = new MyConn();
	}

	@Override
	public int insertDetails(User user) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("insert into booking(name,contactno,booked_seats) values(?,?,?)");
			s.setString(1,user.getName());
			s.setInt(2,user.getContact());
			s.setInt(3,user.getBookedSeats());
		    i = s.executeUpdate();
		    s.close();
		    PreparedStatement s1 = con.prepareStatement("select * from booking where name = ? and contactno = ? and booked_seats = ?");
		    s1.setString(1,user.getName());
			s1.setInt(2,user.getContact());
			s1.setInt(3,user.getBookedSeats());
			ResultSet rs = s1.executeQuery();
			if(rs.next()) {
				user.setBookingId(rs.getInt("booking_id"));
			}
			s1.close();
		    con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public ArrayList<User> showDetails(int bookingId) {
		// TODO Auto-generated method stub
		//boolean flag = false;
		 ArrayList<User> arr = new ArrayList<>();
		try {
			System.out.println("booking ID "+bookingId);
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from booking where booking_id = ?");
			s.setInt(1,bookingId);
		    ResultSet rs = s.executeQuery();
		    while(rs.next()) {
		    	User user = new User();
		    	user.setBookingId(rs.getInt("booking_id"));
		    	user.setBookedSeats(rs.getInt("booked_seats"));
		    	user.setDeptDate(rs.getString("Dept_date"));
		    	user.setTime(rs.getString("time1"));
		    	user.setName(rs.getString("name"));
		    	user.setContact(rs.getInt("contactno"));
		    	user.setFlightNo(rs.getString("flight_no"));
		    	arr.add(user);
		    }
			s.close();
			con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}

}
