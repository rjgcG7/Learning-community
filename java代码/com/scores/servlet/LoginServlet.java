package com.scores.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.scores.domain.admin;
import com.scores.domain.student;
import com.scores.service.ScoresService;
import com.scores.service.UserService;
import com.scores.service.adminService;
import com.scores.service.studentService;

import aop.alters;

@Repository("cuser")
public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		student user=new student();
		user.setUserid(request.getParameter("userid"));
		user.setPassword(request.getParameter("password"));
		studentService userservice=new studentService();
		adminService userservice2=new adminService();
		student a= userservice.CheckLogin(user);
		admin b=userservice2.CheckLogin(user);
		System.out.println(user.getUserid()+user.getPassword());
		if(b!=null) {
			response.sendRedirect("/duanxueqi/index2.html");
		}		
		else if(a!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("user",a);
			response.sendRedirect("/duanxueqi/new_file.html");
		}
		else {
			response.sendRedirect("/duanxueqi/error.jsp");
		}
	}

}
