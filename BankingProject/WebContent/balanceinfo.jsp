<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.io.*" %>
    <%@ page import="javax.servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css">

</head>
<body>
<div id="top_links">
<div id="header">
	<h1>APANA - BANK<span class="style1"></span></h1>
    <h2>ExtraOrdinary Service</h2>
    <A href="index.html"><IMG SRC="images/home1.gif"></IMG></A>	
   
</div>
<div id="navigation">
    <ul>
    <li><a href="create.jsp">NEW ACCOUNT</a></li>
    <li><a href="balance.jsp">BALANCE</a></li>
    <li><a href="deposit.jsp">DEPOSIT</a></li>
    <li><a href="withdraw.jsp">WITHDRAW</a></li>
    <li><a href="transfer.jsp">TRANSFER</a></li>
    <li><a href="closeac.jsp">CLOSE A/C</a></li>
    <li><a href="about.jsp">Contact Us</a></li>
    </ul>
</div>
<table style="width:897px; background:#FFFFFF; margin:0 auto;">
<tr>
	<td width="300" valign="top" style="border-right:#666666 1px dotted;">
    	<div id="services"><h1>Services</h1><br>
		    <ul>
        		<li><a href="#">www.javatpoint.com</a></li>
            	<li><a href="#">www.javacstpoint.com </a></li>
            	<li><a href="#">www.javatpoint.com/forum.jsp</a></li>
            </ul>
       </div>
	</td>
	<td width="1200" valign="top">
		<div id="welcome" style="border-right:#666666 1px dotted;"><h1>BALANCE FORM</h1><br>
		<!--  	<%
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			String num=request.getParameter("accountno");
			//int no=Integer.parseInt(num);
			System.out.println("try catch"+username);
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
				out.print("Welcome"+username);
				out.print("<table align='left' cellspacing='5' cellpadding='5'>");
				out.print("<tr><th>ACCOUNT NO</th><th>USERNAME</th><th>AMOUNT</th><th>ADDRESS</th><th>PHONE</th></tr>");
				while(res.next()){
				    int accountno1=res.getInt(1);
					//session.setAttribute("accountno",accountno1);
					
					
					
					out.print("<tr>");
					out.print("<td>" + res.getInt(1) + "</td>");
					out.print("<td>" + res.getString(2) + "</td>");
					out.print("<td>" + res.getFloat(5) + "</td>");
					out.print("<td>" + res.getString(6) + "</td>");
					out.print("<td>" + res.getInt(7) + "</td>");
					out.print("</tr>");
				
				}
				out.print("</table>");
			}
			else{
				out.print("Please check your username and Password");
				request.setAttribute("balance","Please check your username and Password");
			}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			%>-->
		</div>
	</td>

 	<td width="299" valign="top">
    	<div id="welcome" style="border-right:#666666 1px dotted;"><h1>Welcome</h1><br>
    	    <center><img src="images/globe_10.gif" alt="business" width="196" height="106"></center><br>
		    <p>Each people plan their site layouts depending upon their business type. Here comes a free designer template which provides you with a selection of different kinds of webdesign   starting from business template, fashion template, media template, Science template, Arts template and much more.</p>
	    	
	    </div>      
    </td>
</tr>

</table>
	<div id="footer_top">
  		<div id="footer_navigation">
  		</div>
  
  			<div id="footer_copyright" >
 				<center><img  alt="business"  width="196" height="106"></center><br>
		    	<p>Each people plan their site layouts depending upon their business type. Here comes a free designer template which provides you with a selection of different kinds of webdesign   starting from business template, fashion template, media template, Science template, Arts template and much more.</p>
	  			Copyright © Your Company Name
	  		</div>
	</div>
</div>

</div>
</body>
</html>