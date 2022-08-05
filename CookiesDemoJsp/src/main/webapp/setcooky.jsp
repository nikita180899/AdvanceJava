<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%
		String uname = request.getParameter("txtName");
		String choice = request.getParameter("radSite");
		String site = "";
		
		switch(choice) {
			case "f":
				site = "facebook.com";
				break;
		
			case "i":
				site = "instagram.com";
				break;
				
			case "t":
				site = "twitter.com";
				break;
		}
		
		Cookie cn = new Cookie("namecooky",uname);
		Cookie cs = new Cookie("sitecooky",site);
		
		cn.setMaxAge(60);
		cs.setMaxAge(60);
		
		response.addCookie(cn);
		response.addCookie(cs);		
	%>
	
	<div class="container">
		<h1 style="color:green">Cookies set successfully !!! </h1>
		
		<p>Click <a href="getcooky.jsp"> here </a>
			to see data from cookies</p>
	</div>
</body>
</html>











