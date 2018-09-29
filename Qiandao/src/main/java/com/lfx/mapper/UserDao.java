package com.lfx.mapper;

import java.util.List;

import com.lfx.domain.User;

public interface UserDao {
	User selectUser(long id);

	List<User> selectAllUser();

	User selectUserByEmail(String email);

	User addUser(User user);

	User removeUser(long id);

	User modifyUser(User user);

}
