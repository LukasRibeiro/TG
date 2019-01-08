<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="../css/bootstrap.css">
        <link rel="stylesheet" href="../css/meuEstilo.css">
        <title>Excluir conta</title>
    </head>
    <body>
         <div>
            <form class="col-md-6 offset-md-3 jumbotron mt-5" action="/excluir" method = "POST">
            <!--Ra-->
            <div class="form-group">
                <label>Ra:</label>
                <input type="text" class="form-control" name="ra" placeholder="Ra">
            </div>
                <button class="botao mt-3" type="submit">Excluir</button>
            </form>
        </div>
    </body>
</html>
