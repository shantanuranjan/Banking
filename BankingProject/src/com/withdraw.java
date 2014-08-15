package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class withdraw
 */
@WebServlet("/withdraw")
public class withdraw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public withdraw() {
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
		String accountno=request.getParameter("accountno");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String amount=request.getParameter("amount");
		int no=Integer.parseInt(accountno);
		float am=Float.parseFloat(amount);
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			PreparedStatement prep=conn.prepareStatement("update newaccount set amount=amount-? where username=? and password=? and accountno=?");
			prep.setFloat(1, am);
			prep.setString(2, username);
			prep.setString(3, password);
			prep.setInt(4, no);
			int i=prep.executeUpdate();
			if(i!=0)
			{
				out.print("Amount withdrawn");
			}
			else
			{
				out.print("error in account");
			}
		}
		catch(SQLException |ClassNotFoundException e)
		{
			e.getMessage();
		}
	}

}
