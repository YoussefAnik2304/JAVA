<%@ page import="com.example.ex2.Player" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dice Game</title>
</head>
<body>
<h1>Dice Game</h1>
<p>Welcome <% Player player = (Player) session.getAttribute("logedInPlayer");
out.print(player.getUsername());

%>!</p>
<p>Roll the dice and try to get the same result twice in a row to score 20 points.</p>



<form action="/gameServlet" method="post">
    <input type="hidden" name="roll" value="<%= (int) (Math.random() * 6) + 1 %>" />
    <input type="submit" value="Roll the Dice" />
</form>
<p>your current score is ${score}</p>
<p>your dice is ${dice}</p>
</body>
</html>
