package com.dao;

import java.util.ArrayList;

import com.dto.User;

public interface UserDao {
		int insertDetails(User user);
		ArrayList<User> showDetails(int bookingId);
}
