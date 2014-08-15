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
 * Servlet implementation class deposit
 */
@WebServlet("/deposit")
public class deposit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deposit() {
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
		float a=Float.parseFloat(amount);
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			PreparedStatement p=conn.prepareStatement("update newaccount set amount=amount+? where accountno=? and username=? and password=?");
			p.setFloat(1, a);
			p.setInt(2, no);
			p.setString(3, username);
			p.setString(4, password);
		    int i=p.executeUpdate();
		    if(i!=0)
		    {
		    	out.print("Amount successfully deposited");
		    }
		    else
		    	out.print("Account doesnt match");
			
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
