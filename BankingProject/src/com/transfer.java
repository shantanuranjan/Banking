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
 * Servlet implementation class transfer
 */
@WebServlet("/transfer")
public class transfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public transfer() {
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
		String taccountno=request.getParameter("taccountno");
		String amount=request.getParameter("amount");
		int uno=Integer.parseInt(accountno);
		int tno=Integer.parseInt(taccountno);
		float am=Float.parseFloat(amount);
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			PreparedStatement prep=conn.prepareStatement("update newaccount set amount=amount-? where username=? and password=? and accountno=? and amount>?");
			prep.setFloat(1, am);
			prep.setString(2, username);
			prep.setString(3, password);
			prep.setInt(4, uno);
			prep.setFloat(5, am);
			int i=prep.executeUpdate();
			if(i!=0)
			{
				out.println("Amount deducted");
				PreparedStatement prep1=conn.prepareStatement("update newaccount set amount=amount+? where accountno=?");
				prep1.setFloat(1, am);
				prep1.setInt(2, tno);
				int j=prep1.executeUpdate();
				if(j!=0)
				{
					out.println("amount successfully transferred");
				}
				else
				{
					out.print("amount cannot be tranferred");
				}
				
			}
			else
				out.print("error in the account");
		}
		catch(SQLException|ClassNotFoundException e)
		{
			e.getMessage();
		}
	}

}
