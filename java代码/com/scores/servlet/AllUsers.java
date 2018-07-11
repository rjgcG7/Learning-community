package com.scores.servlet;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scores.*;
import com.scores.service.AdminService;
import com.scores.service.ScoresService;

import aop.alters;

public class  AllUsers  extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	HttpSession session = request.getSession();	
	AdminService adminservice=new AdminService();
	int cid = 0;
	List list=adminservice.getAllUsers();
	session.setAttribute("allusers",list);
	String xmlPath = "aop/applicationContent.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	alters cusers = (alters)applicationContext.getBean("alters");
	cusers.pass();
	response.sendRedirect("/wxh/admin.jsp");
	}
}