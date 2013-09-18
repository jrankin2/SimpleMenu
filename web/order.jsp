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
        <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/themes/excite-bike/jquery-ui.css" type="text/css" media="all" />
        <link rel="stylesheet" href="css/menuStyle.css" type="text/css" />
    </head>
    <body>
        <div id="orderingControls" class="box">
            <div id="menuItems">
                <h1>Menu</h1>
                <%
                    List<MenuItem> menu = (List<MenuItem>) request.getAttribute("menu");
                    for (int i = 0; i < menu.size(); i++) {
                        MenuItem item = menu.get(i);
                        out.println(item.toHTML(i));
                    }
                %>
            </div>

            <div id="orderItems" class="box right">
                <h1>Current Order</h1>
            </div>
        </div>
        <ul id="menu">
            <li class="add"><a href="#">Add to order</a></li>
            <li class="remove"><a href="#">Remove from order</a></li>
        </ul>

        <form id="menuForm" action="#" method="GET">
            <input type="submit" value="Order!"/>
        </form>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.js"></script>
        <script src="js/order.js"></script>
    </body>
</html>
