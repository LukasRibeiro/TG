<%-- 
    Document   : excluir
    Created on : 07/01/2019, 16:18:36
    Author     : Lucas Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div>
            <form action="/Excluir" method = "POST">
                ra: <input type="text" name="ra" value=""><br>
                
                <button type="submit">excluir</button>
            </form>
        </div>
    </body>
</html>
