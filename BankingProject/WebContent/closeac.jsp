<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Global Banking ..</title>
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
		<div id="welcome" style="border-right:#666666 1px dotted;"><h1>CLOSE ACCOUNT FORM</h1><br>
			<table  align="center" bgcolor="white">
				<tr>
			
				</tr>
				<tr>
					<td>
						<form name="F1" onSubmit="return checkcondition(this)" action="closeac" method="post" >
				  			 <table cellspacing="5" cellpadding="3">
				    <tr><td>ACCOUNT NO:</td><td> <input type="text" name="accountno"/></td></tr>
					<tr><td>USER NAME:</td><td> <input type="text" name="username"/></td></tr>
					<tr><td>PASSWORD:</td><td> <input type="password" name="password"/></td></tr>
					
					<tr><td></td><td><input type="submit" value="Submit"/>
					
                   
                    <INPUT TYPE=RESET VALUE="CLEAR"></td></tr>
                   	</table>
               			</form>
					</td>
				</tr>
			</table>
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
</body>
</html>