<%-- 
    Document   : index
    Created on : Sep 23, 2013, 7:49:56 PM
    Author     : jrankin2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Item Administration</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        
        
        
        <div class="container">
            <div class="row">
                <h1>Menu Items</h1>
                <div class="well well-small">
                    <a class="btn btn-success" href="AdminController?a=0">Add New Menu Item</a><br/><br/>
                    <table class="table table-bordered table-hover table-condensed">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Price</th>
                                <th>Image URL</th>
                                <th colspan="2"/>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="menuItem" items="${menuItems}" varStatus="i">
                                <tr>
                                    <td>${menuItem.name}</td>
                                    <td>${menuItem.price}</td>
                                    <td>${menuItem.imagePath}</td>
                                    <td><a href="AdminController?id=${menuItem.dbId}&a=2" class="btn btn-success">Edit</a></td>
                                    <td><a href="AdminController?id=${menuItem.dbId}&a=3" class="btn btn-danger">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
        <script type="text/javascript">
            $(function() {
                /*
                $('a').click(function(e) {
                    e.preventDefault();
                    $.get($(e.target).attr('href'), function(data) {
                        var modal = $('.modal');
                        if(!modal.count > 0){
                            modal = $('<div/>').addClass('modal col-md-4 well').appendTo('body');
                        }
                        modal.html(data).dialog({modal:true});
                        //alert(data);
                    });
                });
                */
            });
        </script>
    </body>
</html>
