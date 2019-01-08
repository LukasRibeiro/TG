<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Cadastre-se</title>
    </head>
    <body>
        <div class="container">
            <form action="/cadastro" method = "POST">
                <h3 class="mb-5">Cadastre-se!</h3>

                <!-- Nome de usuario-->
                <div class="form-group">
                    <label>Usuario:</label>
                    <input type="text" class="form-control" name="nome" placeholder="Nome">
                </div>

                <!--Ra-->
                <div class="form-group">
                    <label>Ra:</label>
                    <input type="text" class="form-control" name="ra" placeholder="Ra">
                </div>

                <!-- senha-->
                <div class="form-group">
                    <label>Senha:</label>
                    <input type="password" class="form-control" name="senha" placeholder="Senha">
                    <span style="color:red">Nao compartilhe sua senha com outras pessoas!</span>
                </div>
                
                <button class="botao mt-3" type="submit">Cadastrar</button>
            </form>
        </div>
    </body>
</html>
