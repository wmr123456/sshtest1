package com.wmr.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.wmr.ssh.dao.UserDao;

@Transactional
public class UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	public void add(){
		System.out.println("userService Add!");
		userDao.add();
	}
}
