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
        import="myPackage.Cart"
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
    String userName = request.getParameter("userName");
    String userId = (String)session.getAttribute("user_" + userName);
    if (userId != null) {
        out.print("<p>Hello user " + userName + " (id " + userId + ")</p>");
    } else {
        if (userName != null) {
            out.print("<p>Hello guest " + userName + "</p>");
        } else {
            String regUserName = request.getParameter("regUserName");
            userId = (String)session.getAttribute("user_" + regUserName);
            if (regUserName != null) {
                out.print("<p>Hello new user " + regUserName + " (id " + userId + ")</p>");
            }
        }
    }
%>
<%=
   "<p>Count (jsp) = " + session.getAttribute("count") + "</p>"
%>

<%-- todo check why it was broken for user/registration cases --%>
<%--<%
    Cart cart = (Cart)session.getAttribute("cart");
    out.print("Cart (jsp): " + cart.getName() + " " + cart.getQuantity());
%>--%>
<%--<%
    out.println(new MyClass().myMethod());
%>

<%=
    new Date()
%>

<%=
    new MyClass()
%>

<%=
    "!!!"
%>--%>
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
