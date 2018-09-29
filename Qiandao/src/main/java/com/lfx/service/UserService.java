package com.lfx.service;

import java.util.List;

import com.lfx.domain.User;

public interface UserService {
	public User selectUser(long userId);

	public List<User> selectAllUser();

	public User selectUserByEmail(String email);

	public User addUser(User user);

	public User removeUser(long userId);

	public User modifyUser(User user);
}
