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

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, ServletException, ServletException, ServletException, IOException{
      
         ServletContext sc = request.getServletContext();
         
         String nome = request.getParameter("nome");
         String senha = request.getParameter("senha");
         
         UsuarioDao loginUsuario;
         loginUsuario = new UsuarioDaoImpl();
         
         Usuario usuario = loginUsuario.findByNomeUsuario(nome, senha);
         
         if(usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)){
            sc.getRequestDispatcher("/jsp/user.jsp").forward(request, response);
         }
         else{
            request.setAttribute("falhaAutenticacao", true);
            sc.getRequestDispatcher("/jsp/index.jsp").forward(request, response);           
        }   
         }
}
