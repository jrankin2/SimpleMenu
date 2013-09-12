<%-- 
    Document   : confirm
    Created on : Sep 11, 2013, 9:10:56 PM
    Author     : jrankin2
--%>

<%@page import="model.Receipt"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="model.MenuItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <%
                List<MenuItem> menu = (List<MenuItem>) request.getAttribute("menu");
                for (int i = 0; i < menu.size(); i++) {
                    MenuItem item = menu.get(i);

                    out.println("<li>");
                    //out.println("<input type='checkbox' name='i"+i+"'/>");
                    out.print(item.getName() + " - $" + String.format("%.02f", item.getPrice()) );
                    out.println("</li>");
                }
            %>
        </ul>

        Your Receipt:
        <ul>
            <li>SubTotal: $${receipt.subTotal}</li>
            <li>Tax: $${receipt.tax}</li>
            <li>Net Total: $${receipt.netTotal}</li>
            <li>Suggested Gratuity: $${receipt.suggestedGratuity}</li>
        </ul>
        
        <a href="MenuController">Back to Menu</a>

    </body>
</html>
