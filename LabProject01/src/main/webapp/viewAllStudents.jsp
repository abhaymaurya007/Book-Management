<%@page import="java.util.Iterator"%>
<%@page import="test.BookBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="test.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
 <style>
        body {
            background-image: url('library-background.jpg'); /* Replace with actual image URL */
            background-size: cover;
            background-position: center;
            font-family: Arial, sans-serif;
        }
        .container {
            margin: 50px auto;
            width: 80%;
            background: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #333;
            color: white;
        }
        .logout {
            display: block;
            text-align: center;
            margin-top: 20px;
            font-size: 18px;
            color: #d9534f;
            text-decoration: none;
            font-weight: bold;
        }
    </style>
<body>
<div class="container">
        <h2>Library Book List</h2>
        <%
        AdminBean ab = (AdminBean) session.getAttribute("ab");
        ArrayList<BookBean> blist = (ArrayList<BookBean>) session.getAttribute("blist");
        if (ab != null) {
            out.println("<p>Welcome, " + ab.getFName() + " admin</p>");
        }
        if (blist != null && !blist.isEmpty()) {
        %>
        <table>
            <tr>
                <th>Book ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Available Copies</th>
               
            </tr>
            <%
            for (BookBean b1 : blist) {
            %>
            <tr>
                <td><%= b1.getBookID() %></td>
                <td><%= b1.getBookName() %></td>
                <td><%= b1.getBookAuthor() %></td>
                <td><%= b1.getBookPrice() %></td>
                <td><%= b1.getBookqty() %></td>
                
            </tr>
            <%
            }
            %>
        </table>
        <%
        } else {
            out.println("<p>No books are available.</p>");
        }
        %>
        <a href="logout.jsp" class="logout">Logout</a>
    </div>
<a href="logout.jsp"><br> logout</a>
</body>
</html>