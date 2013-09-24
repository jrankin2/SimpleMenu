<%-- 
    Document   : modifyMenuItem
    Created on : Sep 23, 2013, 7:50:12 PM
    Author     : jrankin2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add/Edit MenuItem</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <form method="POST" action="AdminController" class="form form-inline">
            <input type="hidden" name="id" value="${id}" />
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" name="name" id="nameInput" class="form-control" placeholder="Name">
            </div>
            
            <div class="form-group">
                <label for="price">Name</label>
                <input type="text" name="price" id="priceInput" class="form-control" placeholder="Name">
            </div>
            
            <div class="form-group">
                <label for="imagePath">Name</label>
                <input type="text" name="imagePath" id="imagePathInput" class="form-control" placeholder="Name">
            </div>
            <input type="submit" value="Go"/>
        </form>
    </body>
</html>
