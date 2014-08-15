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
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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
		String name = request.getParameter("username");
	    
	    String password=request.getParameter("password");
	    String repassword=request.getParameter("repassword");
	    String amount=request.getParameter("amount");
	    String gender=request.getParameter("gender");
	    String address=request.getParameter("address");
	    String phone=request.getParameter("phone");
	    response.setContentType("text/html");  
	    PrintWriter out=response.getWriter();
	    try  
	    {  
	    	
	    Class.forName("com.mysql.jdbc.Driver");  
	    
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");  
	    
	    PreparedStatement stmt=con.prepareStatement("INSERT INTO NEWACCOUNT(username, password, repassword, amount, gender, address,phone) VALUES (?,?,?,?,?,?,?)");  
	    
	    stmt.setString(1, name);  
	    stmt.setString(2, password);  
	    stmt.setString(3, repassword);  
	    stmt.setDouble(4, Float.parseFloat(amount));  
	    stmt.setString(5, gender);  
	    stmt.setString(6, address);  
	    stmt.setInt(7, Integer.parseInt(phone));
	
	    int i=stmt.executeUpdate();  
	    if(i!=0){    
	        out.println("<b>You are successfully Registered</b>");    
	      }    
	      else{    
	          out.println("<b>Registration failed</b>");  
	       }    
	    }    
	    catch(ClassNotFoundException e){    
	        out.println("Couldn't load database driver: " + e.getMessage());    
	      }    
	      catch(SQLException e){    
	        out.println("SQLException caught: " + e.getMessage());    
	      }    
	      catch (Exception e){    
	        out.println(e);    
	    }    
	}

}
