package com.exilant.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exilant.db.DBConnection;
import com.exilant.to.EmployeeTO;

@WebServlet("/login")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String page="";
	Connection con=null;
	java.sql.PreparedStatement ps=null;
	ResultSet rs=null;
	String unm=req.getParameter("userName");
	String pass = req.getParameter("password");
	
	try {
		
		con=DBConnection.getConnection();
		con.setAutoCommit(false);
		String sql = "select * from EMP_LOGIN where username='"+unm+"' AND password='"+pass+"'";
		
		ps = con.prepareStatement(sql);
		
		rs=ps.executeQuery();
		
		if(rs.next()) {
			int eid=rs.getInt("eid");
			String sql1="select * from EMP_DETAILS where eid="+eid;
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery(sql1);
			if(rs1.next()) {
				
				String fname=rs1.getString("fname");
				String lname=rs1.getString("lname");
				int age = rs1.getInt("age");
				long phone = rs1.getLong("phone");
				String email=rs1.getString("email");
				String gender= rs1.getString("gender");
				EmployeeTO eto = new EmployeeTO(eid,fname,lname,age,phone,email,gender,unm,pass);
				req.setAttribute("ETO",eto);
			}
			
			page="home.jsp";
		}else {
			page="error.jsp";
		}
		RequestDispatcher rd =req.getRequestDispatcher(page);
		rd.forward(req, res);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	

	
	}
	

}
