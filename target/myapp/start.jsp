<%@ page import="java.time.LocalTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Start</title>
    </head>
<body>

    <% String name = "Amantur"; %>

    <%= name.length() %>

    <% for (int i = 0; i < name.length(); i++) { %>
        <p> <%= name.charAt(i) %> </p>
    <% } %>

    <%=LocalTime.now()%>
        <% System.out.println(LocalTime.now()); %>

    </body>
</html>
