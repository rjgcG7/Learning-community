package com.scores.service;

import java.sql.SQLException;
import java.util.List;

import com.scores.dao.ClassDao;
import com.scores.dao.HomeworkDao;

public class HomeworkService {
	public List getAllHomework(int i1,int i2){
		HomeworkDao classDAO=new HomeworkDao();
		List li=classDAO.getAllHomework(i1,i2);
		 return classDAO.getAllHomework(i1,i2);
		}
	public void getAddClass(String i2,String i3,int i4){
		ClassDao classDAO=new ClassDao();
		try {
			classDAO.getAddClass(i2,i3,i4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public void getDeleteClass(int i1,int i2){
		ClassDao classDAO=new ClassDao();
		classDAO.getDeleteClass(i1,i2);
		}
	
}
