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
import com.scores.service.ScoresService;

import aop.alters;

public class AllServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	String getCid= (String)request.getParameter("id");
//	System.out.println(123);
	HttpSession session = request.getSession();	
//	System.out.println(getCid);
	ScoresService scoreservice=new ScoresService();
	int cid = 0;
	if(getCid!=null)
		cid = Integer.parseInt(getCid);
	else {
		cid=Integer.parseInt((String)session.getAttribute("nowclassid"));
	}
	List list=scoreservice.getAllScores(cid);
	String Scid = cid+"";
	session.setAttribute("nowclassid",Scid);
	session.setAttribute("allscores",list);
//	request.setAttribute("allscores",list);
//	System.out.println(222222);
//	request.getRequestDispatcher("showAllScores.jsp").forward(request, response);
	String xmlPath = "aop/applicationContent.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	alters cusers = (alters)applicationContext.getBean("alters");
	cusers.pass();
	response.sendRedirect("/wxh/showAllScores.jsp");
	}
}