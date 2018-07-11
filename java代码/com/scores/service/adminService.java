package com.scores.service;

import java.sql.SQLException;

import com.scores.dao.ScoreDao;
import com.scores.dao.UserDao;
import com.scores.dao.adminDao;
import com.scores.dao.studentDao;
import com.scores.domain.*;

public class adminService {
//public static boolean CheckLogin(User user){
//	if(user.getUsername().equals("admin")&&user.getPassword().equals("123456")){
//		return true;
//	}
//	return false;
//	}
	public static admin CheckLogin(student user) {
		admin user1 = new admin();
		adminDao userdao=new adminDao();
		if((user1=userdao.checkuser(user.getUserid(), user.getPassword()))!=null) {
//			System.out.println(1111111);
			return user1;
		}
//		System.out.println(222222);
		return null;
	}
	
}