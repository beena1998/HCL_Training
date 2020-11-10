package com.dao;

import com.appexception.UserException;
import com.model.User;

public interface UserDao {
	boolean createUser(int userId, String userName, String password);

	User createUser(User user);

	User readByUser(int id) throws UserException;

	boolean updateUser(User user);

	boolean deleteByUserId(int id);
}
