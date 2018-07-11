package com.scores.servlet;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.scores.*;
import com.scores.domain.User;
import com.scores.service.ScoresService;

public class UpdateServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  ScoresService scoreservice=new ScoresService();
		  HttpSession session = request.getSession();
			User user=(User) session.getAttribute("user");
			int sno = (int) session.getAttribute("updatesno");
			int grade=Integer.parseInt((String)request.getParameter("grade"));
			int cid=Integer.parseInt((String)session.getAttribute("nowclassid"));
		  scoreservice.getUpdateScores(sno,cid,grade);
		  response.sendRedirect("/wxh/showAllScores.jsp");
		}
} 

