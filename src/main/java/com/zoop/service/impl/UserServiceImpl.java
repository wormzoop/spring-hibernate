package com.zoop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoop.dao.UserDao;
import com.zoop.entity.User;
import com.zoop.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public List<User> getUserList() {
		return userDao.getUserList();
	}

}
