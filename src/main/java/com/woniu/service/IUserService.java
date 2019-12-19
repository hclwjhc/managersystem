package com.woniu.service;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserService {
	void save(User user);
	Integer getUid(User user);//根据页面登录信息查询出对应的用户ID
	String login(User user);
}
