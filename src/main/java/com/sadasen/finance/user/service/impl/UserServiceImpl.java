package com.sadasen.finance.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.sadasen.finance.user.entity.User;
import com.sadasen.finance.user.service.UserService;

/**
 * @date 2018年1月16日
 * @author lei.ys
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public User add(User user) {
		mongoTemplate.insert(user);
		return user;
	}

	@Override
	public User findById(long id) {
		return mongoTemplate.findById(id, User.class);
	}

	@Override
	public User deleteById(long id) {
		User user = mongoTemplate.findById(id, User.class);
		mongoTemplate.remove(user);
		return user;
	}

}
