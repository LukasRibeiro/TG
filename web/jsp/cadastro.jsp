<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form action="/cadastro" metohod = "POST">
                name: <input type="text" name="name" value=""><br>
                ra: <input type="text" name="ra" value=""><br>
                senha: <input type="text" name="senha" value=""><br>
                
                <input type="submit" value="Submit">
            </form>
        </div>
    </body>
</html>
