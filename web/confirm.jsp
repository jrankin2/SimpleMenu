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
        <title>Receipt</title>
        <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/themes/excite-bike/jquery-ui.css" type="text/css" media="all" />
        <link rel="stylesheet" href="css/menuStyle.css" type="text/css" />


    </head>
    <body>

        <div id="finalOrder" class="box">
            <h1>Your Order</h1>
            <%
                List<MenuItem> menu = (List<MenuItem>) request.getAttribute("menu");
                for (int i = 0; i < menu.size(); i++) {
                    MenuItem item = menu.get(i);
                    out.println(item.toHTML(i));
                }
            %>
        </div>
        <div id="receipt" class="box right">
            <h1>Receipt</h1>
            ${receipt.toHTML()}
        </div>

        <br/>
        <a href="MenuController">Back to Menu</a>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
        <script>
            $('a').button();
        </script>
    </body>
</html>
