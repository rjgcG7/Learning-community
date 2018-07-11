package com.scores.service;

import java.sql.SQLException;

import com.scores.dao.UserDao;
import com.scores.dao.studentDao;
import com.scores.domain.*;

public class studentService {
//public static boolean CheckLogin(User user){
//	if(user.getUsername().equals("admin")&&user.getPassword().equals("123456")){
//		return true;
//	}
//	return false;
//	}
	public static student CheckLogin(student user) {
		student user1 = new student();
		studentDao userdao=new studentDao();
		if((user1=userdao.checkuser(user.getUserid(), user.getPassword()))!=null) {
//			System.out.println(1111111);
			return user1;
		}
//		System.out.println(222222);
		return null;
	}
	public void getAdd(String i1,String i2, String i3){
		studentDao studentDAO=new studentDao();
		try {
			studentDAO.getAdd(i1,i2,i3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}