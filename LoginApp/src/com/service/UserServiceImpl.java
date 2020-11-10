package com.service;

import com.appexception.UserException;
import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public boolean createUser(int userId, String userName, String password) throws UserException {
		if (password.length() > 7) {
			UserDao userDao = new UserDaoImpl();

		} else {
			throw new UserException("Password greater than 7");
		}
		return false;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readByUser(int id) throws UserException {
		User usertemp=null;
		int len = Integer.toString(id).length();
		if(len>5) {
			UserDao userDao=new UserDaoImpl();
			usertemp=userDao.readByUser(id);
		}
		else {
			throw new UserException("Enter more than 5 digits");
		}
		return usertemp;
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
