<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
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
            color: #dc3545;
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
//out.println("you r logout "+"<br>");
    
%>
 <div class="container">
        <h2>You Have Logged Out</h2>
        <p>Thank you for using the system. You can log in again if needed.</p>
        <a href="login.html" class="btn">Login Again</a>
        <a href="home.html" class="btn">Go to Home</a>
    </div>
</body>
</html>