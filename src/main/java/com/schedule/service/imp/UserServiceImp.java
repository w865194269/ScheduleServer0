package com.schedule.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.schedule.beans.User;
import com.schedule.dao.UserDao;
import com.schedule.exception.bean.BaseException;
import com.schedule.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;

	@Override
	public User addUser(User user) throws Exception {
		try {
			userDao.addUser(user);
			user = userDao.getUser(user);
		} catch (Exception e) {
			throw new BaseException(e.getMessage());
		}	
		return user;
	}

	@Override
	public User getUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
