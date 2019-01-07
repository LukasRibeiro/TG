<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form action="/">
                name: <input type="text" name="nome" value=""><br>
                senha: <input type="text" name="senha" value=""><br>
                <input type="submit" value="Submit">
                
                <p class="text-center">Nao possui uma conta, então
                    <a id="novologin" href="/cadastro">Cadastre-se!</a>
                </p>
            </form>
        </div>
    </body>
</html>
