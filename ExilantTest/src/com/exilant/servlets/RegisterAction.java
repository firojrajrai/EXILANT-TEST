package com.exilant.servlets;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.exilant.db.DBConnection;

public class RegisterAction extends HttpServlet {
	Connection con=null;
	PreparedStatement ps1=null;
	PreparedStatement ps2=null;
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	System.out.println("**************REGISTER SERVLET****************");
	RequestDispatcher rd=null;
	try {	
	
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String age=req.getParameter("age");
		String phone=req.getParameter("phone");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String username=req.getParameter("unm");
		String password=req.getParameter("pwd");
	
System.out.println(firstName+"\t"+lastName+"\t"+age+"\t"+phone+"\t"+email+"\t"+gender);
System.out.println(username+"\t"+password);
		
		String sql1 = "insert into EMP_DETAILS(fname,lname,age,phone,email,gender) values(?,?,?,?,?,?)";
		String sql2 = "insert into EMP_LOGIN(eid,username,password) values(?,?,?)";
		
		con=DBConnection.getConnection();
		con.setAutoCommit(false);
		ps1=con.prepareStatement(sql1);
		ps1.setString(1, firstName);
		ps1.setString(2, lastName);
		ps1.setString(3, age);
		ps1.setString(4, phone);
		ps1.setString(5, email);
		ps1.setString(6, gender);
		int x=ps1.executeUpdate();
		
		int eid=0;
		Statement st =con.createStatement();
		ResultSet rs =st.executeQuery("select max(eid) from EMP_DETAILS");
		rs.next();
		eid=rs.getInt(1);	
		System.out.println("==GETTING EID==");
		
		
		ps2 = con.prepareStatement(sql2);
		ps2.setString(1, eid+"");
		ps2.setString(2,username);
		ps2.setString(3, password);
		int y = ps2.executeUpdate();
		
		if(x!=0 && y!=0) {
			System.out.println("RECORD INSERTED....");
		}
	
		rd = req.getRequestDispatcher("index.jsp");
		req.setAttribute("MSG","You have been Registered Now");
		con.commit();
		rd.forward(req, res);
		}catch(Exception e) {
			e.printStackTrace();
			try {
			con.rollback();
			rd = req.getRequestDispatcher("register.jsp");
			req.setAttribute("MSG","Enter Correct Data");
			rd.forward(req, res);
			}catch(Exception e1) {e1.printStackTrace();}
		}finally {
			try {
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
