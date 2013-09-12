<%-- 
    Document   : order
    Created on : Sep 11, 2013, 8:21:00 PM
    Author     : jrankin2
--%>

<%@page import="model.IMenuService"%>
<%@page import="java.util.List"%>
<%@page import="model.MenuItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order</title>
    </head>
    <body>

        <form id="menuForm" action="OrderConfirmationController" method="GET">
            <ul>
            <%
                List<MenuItem> menu = (List<MenuItem>)request.getAttribute("menu");
                for (int i = 0; i < menu.size(); i++) {
                    MenuItem item = menu.get(i);
                    
                    out.println("<li>");
                    out.println("<input type='checkbox' name='i"+i+"'/>");
                    out.print(item.getName() + " - $" + item.getPrice());
                    out.println("</li>");
                }
            %>
            </ul>
            
            <input type="submit" value="Order!"/>
        </form>



    </body>
</html>
