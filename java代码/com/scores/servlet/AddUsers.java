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

import com.scores.*;
import com.scores.service.ScoresService;
import com.scores.service.studentService;

public class  AddUsers  extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	HttpSession session = request.getSession();	
	studentService adminservice=new studentService();
	String getuserid= (String)request.getParameter("name");
	String getusername= (String)request.getParameter("name2");
	String getpassword= (String)request.getParameter("ps1");
	adminservice.getAdd(getuserid,getusername,getpassword);
	response.sendRedirect("/duanxueqi/index.html");
	}
}