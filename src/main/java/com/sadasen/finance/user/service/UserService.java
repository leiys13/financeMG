package com.sadasen.finance.user.service;

import com.sadasen.finance.user.entity.User;

/**
 * @date 2018年1月16日
 * @author lei.ys
 * @desc
 */
public interface UserService {
	
	public User add(User user);
	
	public User findById(long id);
	
	public User deleteById(long id);

}
