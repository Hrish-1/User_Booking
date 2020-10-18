package com.service;

import java.util.ArrayList;

import com.dao.UserDao;
import com.dao.UserDaoImple;
import com.dto.User;

public class UserServiceImple implements UserService {
	
	UserDao userDao;
	public UserServiceImple(){
		userDao = new UserDaoImple();
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return userDao.insertDetails(user);
	}

	@Override
	public ArrayList<User> show(int bookingId) {
		// TODO Auto-generated method stub
		return userDao.showDetails(bookingId);
	}

}
