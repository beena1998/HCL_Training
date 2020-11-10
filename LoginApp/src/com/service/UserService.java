package com.service;

import com.appexception.UserException;
import com.model.User;

public interface UserService {
	boolean createUser(int userId, String userName, String password) throws UserException;

	User createUser(User user);

	User readByUser(int id) throws UserException;

	boolean updateUser(User user);

	boolean deleteByUserId(int id);
}
