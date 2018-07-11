
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
import com.scores.service.AdminService;
import com.scores.service.ScoresService;

public class DeleteUsers  extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	String getid= (String)request.getParameter("id");
	HttpSession session = request.getSession();	
	AdminService adminservice=new AdminService();
	int id = 0;
	if(getid!=null)
		id = Integer.parseInt(getid);
	else {
		id=Integer.parseInt((String)session.getAttribute("nowuserid"));
	}
	adminservice.getDeleteUsers(id);
	session.setAttribute("nowuserid",id);
	response.sendRedirect("/wxh/admin.jsp");
	}
}