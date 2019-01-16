<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
        <title>Pagina do usuario</title>
    </head>
    <body>
        <h1>Funcionou, voce esta logado no sistema</h1>
        
        <form action="/logout" method="GET">
            <button class="botao mt-3">logout</button>
        </form>
    </body>
</html>
