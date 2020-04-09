<%--
  Created by IntelliJ IDEA.
  User: тест
  Date: 09.04.2020
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page
    import="java.util.Date"
%>
<%@ page
    import="myPackage.MyClass"
%>
<html>
<head>
    <title>First JSP</title>
</head>
<body>

    <%
        out.println(new MyClass().myMethod());
    %>

    <%=
        new Date()
    %>
    <%--<%
        Date date = new Date();
    %>

    <p><i>Current time:</i></p>

    !!!!!!
    <%=
        date
    %>--%>
    <%--<%= "Hello world2" %>
    <%
        for (int i = 0; i < 20; i++) {
            out.print("<p>Hello world " + i + "</p>");
        }
//        ...
        for (int i = 0; i < 20; i++) {
            out.print("Hello world3 " + i);
        }
    %>--%>
</body>
</html>
