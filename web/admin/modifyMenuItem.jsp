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
    <body style="padding-top:20px;">
        <div class="container">


            <form method="POST" action="AdminController" class="form-horizontal">
                <input type="hidden" name="id" value="${item.dbId}" />
                <input type="hidden" name="a" value="${a}" />
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" name="name" id="nameInput" class="form-control" value="${item.name}" placeholder="Name">
                </div>

                <div class="form-group">
                    <label for="price">Price</label>
                    <input type="text" name="price" id="priceInput" class="form-control" value="${item.price}" placeholder="Price">
                </div>

                <div class="form-group">
                    <label for="imagePath">Image Path</label>
                    <input type="text" name="imagePath" id="imagePathInput" class="form-control" value="${item.imagePath}" placeholder="Image Path">
                </div>
                <input type="submit" value="Go"/>
            </form>
        </div>
    </body>
</html>
