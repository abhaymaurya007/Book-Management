<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginned</title>
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

String m=(String)request.getAttribute("msg");
//out.println(m+"<br>");
AdminBean ab=(AdminBean)session.getAttribute("ab");
// out.println("welcome :"+ab.getFName()+"<br>"); 

%>
  <div class="container">
        <h2>Welcome, Admin</h2>
        <p>Choose an action:</p>
        <a href="addBook.html" class="btn">Add Book</a>
        <a href="viewBooks" class="btn">View Books</a>
        <a href="logout.jsp" class="btn">Logout</a>
    </div>
</body>
</html>