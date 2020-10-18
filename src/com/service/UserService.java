package com.service;

import java.util.ArrayList;

import com.dto.User;

public interface UserService {
	int insert(User user);
	ArrayList<User> show(int booking_id);
}
