package com.scores.service;

import com.scores.dao.UserDao;
import com.scores.domain.*;

public class UserService {
//public static boolean CheckLogin(User user){
//	if(user.getUsername().equals("admin")&&user.getPassword().equals("123456")){
//		return true;
//	}
//	return false;
//	}
	public static User CheckLogin(User user) {
		User user1 = new User();
		UserDao userdao=new UserDao();
		if((user1=userdao.checkuser(user.getUsername(), user.getPassword()))!=null) {
//			System.out.println(1111111);
			return user1;
		}
//		System.out.println(222222);
		return null;
	}
	
}