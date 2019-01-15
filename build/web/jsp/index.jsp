<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="../css/bootstrap.min">
        <link rel="stylesheet" href="../css/meuEstilo">
        
        <title>Seja bem vindo - Login</title>
    </head>
    <body>
        <div class="container">
            <form class="col-md-6 offset-md-3 jumbotron mt-5" action="/login" method="POST">
                
                <div class="form-group">
                    <!-- Nome de usuario-->
                    <label>Usuario:</label>
                    <input type="text" class="form-control" name="nome" placeholder="Nome">
                </div>

                <div class="form-group">
                    <!-- senha-->
                    <label>Senha:</label>
                    <input type="password" class="form-control" name="senha" placeholder="Senha">
                </div>
                
                <center>
                    <button class="botao mt-3" type="submit">Acessar</button>
                </center>
                
                <p class="text-center">Nao possui uma conta, então
                    <a id="cadastro" href="/jsp/cadastro.jsp">Cadastre-se!</a>
                </p>
                
                <p class="text-center"> deseja excluir sua conta,
                    <a id="excluir" href="/jsp/excluir.jsp">clique aqui</a>
                </p>
            </form>
        </div>
    </body>
</html>
