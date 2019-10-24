<%@page import="java.util.*"%>
<%!
	Date d=null;
	String date=null;
%>
<%
	d=new Date();
	date=d.toString();
%>
<html>
	<body bgcolor="lightyellow">
		<center><b><font size="6" color="red"><br><br>
		Today Date : <%=date%>
	</font></b></center></body>
</html>
