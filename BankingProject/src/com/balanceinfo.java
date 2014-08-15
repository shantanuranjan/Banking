package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class balanceinfo
 */
@WebServlet("/balanceinfo")
public class balanceinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public balanceinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String num=request.getParameter("accountno");
		//int no=Integer.parseInt(num);
		System.out.println("try catch"+username);
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("try catch");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root"); 
		PreparedStatement prep=con.prepareStatement("select * from NEWACCOUNT where username=? and password=?");
		prep.setString(1, username);
		prep.setString(2, password);
		//prep.setInt(3, no);
		boolean b=prep.execute();
		ResultSet res=prep.executeQuery();
		if(b==true)
		{
			out.print("Welcome "+username);
			out.print("<table align='left' cellspacing='5' cellpadding='5'>");
			out.print("<tr><th>ACCOUNT NO</th><th>USERNAME</th><th>AMOUNT</th><th>ADDRESS</th><th>PHONE</th></tr>");
			while(res.next()){
			    int accountno1=res.getInt(1);
				//session.setAttribute("accountno",accountno1);
				
				
				
				out.print("<tr>");
				out.print("<td>" + res.getInt(1) + "</td>");
				out.print("<td>" + res.getString(2) + "</td>");
				out.print("<td>" + res.getFloat(5) + "</td>");
				out.print("<td>" + res.getString(7) + "</td>");
				out.print("<td>" + res.getInt(8) + "</td>");
				out.print("</tr>");
			
			}
			out.print("</table>");
		}
		else{
			out.print("Please check your username and Password");
			request.setAttribute("balance","Please check your username and Password");
		}
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
