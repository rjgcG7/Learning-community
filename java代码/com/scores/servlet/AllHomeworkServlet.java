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
import com.scores.service.HomeworkService;
import com.scores.service.ScoresService;

import aop.alters;

public class AllHomeworkServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	HomeworkService classservice=new HomeworkService();
	HttpSession session = request.getSession();	
	String getSno=(String)request.getParameter("sno");
	int cid=Integer.parseInt((String)session.getAttribute("nowclassid"));
	int sno = 0;
	if(getSno!=null)
		sno = Integer.parseInt((String)request.getParameter("sno"));
	else {
		sno=(int) session.getAttribute("homeworksno");
	}
	List list=classservice.getAllHomework(sno,cid);
	session.setAttribute("homeworksno",sno);
	session.setAttribute("allhomework",list);
	String xmlPath = "aop/applicationContent.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	alters cusers = (alters)applicationContext.getBean("alters");
	cusers.pass();
	response.sendRedirect("/wxh/homework.jsp");
	}
}
