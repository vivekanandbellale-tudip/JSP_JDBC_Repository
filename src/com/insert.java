package com;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class insert
 */

public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out=response.getWriter();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mno = request.getParameter("mno");
	try{	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		PreparedStatement ps = con.prepareStatement("insert into id(fname,lname,mno) values(?,?,?)");
		
		ps.setString(1,fname);
		ps.setString(2,lname);
		ps.setString(3,mno);
		
		ps.execute();
//		 out.println("Data Inserted");
		
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	HttpSession session  = request.getSession();
	session.setAttribute("msg", "Your Data stored successfully");
	RequestDispatcher rd=request.getRequestDispatcher("save.jsp");
			rd.include(request, response);
	}

}
