package com.dao;

import com.appexception.UserException;
import com.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean createUser(int userId, String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readByUser(int id) throws UserException {
		User user = null;
		if (id == 123456) {
			user = new User();
			user.setUserId(id);
			user.setUserName("Beena");
			user.setPassword("kandpallalalal");

		}else {
			throw new UserException("No user found in DB");
		}
		return user;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByUserId(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
