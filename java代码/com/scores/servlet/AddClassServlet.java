package com.scores.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.scores.domain.Classes;
import com.scores.domain.User;
import com.scores.service.ClassService;
import com.scores.service.ScoresService;

public class AddClassServlet  extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	ClassService classservice=new ClassService();
	HttpSession session = request.getSession();
	User user=(User) session.getAttribute("user");
	Classes classes=new Classes();
	classes.setCname((request.getParameter("cname")));
	classservice.getAddClass(classes.getCname(),user.getTname(),user.getTid());
	response.sendRedirect("/wxh/addclass.jsp");
	}
}
