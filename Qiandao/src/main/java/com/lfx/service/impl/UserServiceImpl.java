package com.lfx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfx.domain.User;
import com.lfx.mapper.UserDao;
import com.lfx.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User selectUser(long userId) {
		return this.userDao.selectUser(userId);
	}

	public List<User> selectAllUser() {
		return this.userDao.selectAllUser();
	}

	public User selectUserByEmail(String email) {
		return this.userDao.selectUserByEmail(email);
	}

	public User addUser(User user) {
		return this.userDao.addUser(user);
	}

	public User removeUser(long userId) {
		return this.userDao.removeUser(userId);
	}

	public User modifyUser(User user) {
		return this.userDao.modifyUser(user);
	}
}
