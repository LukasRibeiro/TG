package controller;

import dao.UsuarioDao;
import daoImpl.UsuarioDaoImpl;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

@WebServlet(urlPatterns = {"/cadastro"})
public class Cadastro extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, ServletException, IOException, IOException, IOException{
        
        ServletContext sc = request.getServletContext();
        
        String nome = request.getParameter("nome");
        String ra = request.getParameter("ra");
        String senha = request.getParameter("senha");
        
        UsuarioDao novoUsuario;
        novoUsuario = new UsuarioDaoImpl();
        
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setRa(ra);
        usuario.setSenha(senha);
        
        boolean status = false;
        status = novoUsuario.inserir(usuario);
        
       if(status){
            sc.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
       }
        else {
            request.setAttribute("erroNoCadastro", 1);
            sc.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
    }
    }
}
