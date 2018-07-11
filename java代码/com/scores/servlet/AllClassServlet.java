package com.scores.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scores.domain.User;
import com.scores.service.ClassService;
import com.scores.service.ScoresService;

import aop.alters;

public class AllClassServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	ClassService classservice=new ClassService();
	HttpSession session = request.getSession();
	User user=(User) session.getAttribute("user");
//	System.out.println(user.getTid());
	List list=classservice.getAllClass(user.getTid());
	session.setAttribute("allclass",list);
//	request.setAttribute("allscores",list);
//	System.out.println(222222);
//	request.getRequestDispatcher("showAllScores.jsp").forward(request, response);
	String xmlPath = "aop/applicationContent.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	alters cusers = (alters)applicationContext.getBean("alters");
	cusers.pass();
	response.sendRedirect("/wxh/success.jsp");
	}
}
