package com.scores.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.scores.domain.Classes;
import com.scores.domain.User;
import com.scores.service.ClassService;

public class DeleteClassServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	ClassService classservice=new ClassService();
	HttpSession session = request.getSession();
	Classes classes=new Classes();
	User user=(User) session.getAttribute("user");
	int cid = Integer.parseInt((request.getParameter("cid")));
	classes.setCid(cid);
	classservice.getDeleteClass(cid,user.getTid());
	response.sendRedirect("/wxh/deleteclass.jsp");
	}
}