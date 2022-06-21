<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import ="java.util.*"%>
<%@page import="shirt.Shirt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main page</title>
</head>
<body>


<table>
<caption>TABLE</caption>
<tr>
<th>INDEX</th>
<th>ACCESSORIES</th>
<th>TAGLINE</th>
<th>POCKET</th>
<th>COLOR</th>
</tr>

<%
ArrayList<Shirt> list = (ArrayList<Shirt>) request.getAttribute("shirts");
for(int i=1;i<=list.size();i++){
	Shirt s = list.get(i-1);
	%>
	 <tr>
	<td><%= i%></td>
	<td><%= s.acc %></td>
	<td><%= s.tag %></td>
	<td><%= s.pocket %></td>
	<td><%= s.color%></td>
	</tr>
<%}
%>
</table>
</body>
</html>