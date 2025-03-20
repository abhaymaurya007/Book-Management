<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book</title>
  <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 400px;
        }
        h2 {
            margin-bottom: 20px;
            color: #28a745;
        }
        .btn {
            display: block;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            padding: 10px;
            border-radius: 5px;
            margin: 10px 0;
            text-align: center;
        }
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<%
BookBean ab=(BookBean)session.getAttribute("Bb");
if(ab!=null){
	String m=(String) request.getAttribute("msg");
	 // out.println(m+"<br>");
}

%>
 <div class="container">
        <h2>Book Added Successfully!</h2>
        <p>Your book has been successfully added to the system.</p>
        <a href="addBook.html" class="btn">Add Another Book</a>
        <a href="adminloginned.jsp" class="btn">Go to Dashboard</a>
    </div>

</body>
</html>