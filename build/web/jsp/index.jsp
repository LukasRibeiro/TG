<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <link rel="stylesheet" href="../css/meuEstilo.css">
        
        <title>Seja bem vindo - Login</title>
    </head>
    <body>
  
        <div class="container">
            <form class="col-md-5 offset-md-3 jumbotron mt-5" action="/login" method="POST">
                
                <div class="form-group">
                    <h3>Login!</h3>
                    <!-- Nome de usuario-->
                    <label>Usuario:</label>
                    <input type="text" class="form-control" name="nome" placeholder="Nome" required="required">
                </div>

                <div class="form-group">
                    <!-- senha-->
                    <label>Senha:</label>
                    <input type="password" class="form-control" name="senha" placeholder="Senha" required="required">
                </div>
                
                <center>
                    <button class="botao mt-3" type="submit">Acessar</button>
                </center>
                
                <p class="text-center mt-3">Nao possui uma conta? Então
                    <a id="cadastro" href="/cadastro">Cadastre-se!</a>
                </p>
                
                <p class="text-center"> Deseja excluir sua conta,
                    <a id="" href="/excluir">Clique aqui!</a>
                </p>
            </form>
        </div>
        <script>
            var cadastrou = <%= request.getAttribute("statusCadastro")%>
            if(cadastrou){
                alert("Cadastrado com Sucesso!");
            }
        </script>
    </body>
    
</html>
