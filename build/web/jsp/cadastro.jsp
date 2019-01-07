<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form action="/cadastro" method = "POST">
                name: <input type="text" name="nome" value=""><br>
                ra: <input type="text" name="ra" value=""><br>
                senha: <input type="password" name="senha" value=""><br>
                
                <button type="submit">Cadastrar</button>
            </form>
        </div>
    </body>
</html>
