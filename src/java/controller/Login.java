package controller;

import dao.UsuarioDao;
import daoImpl.UsuarioDaoImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, ServletException, ServletException, ServletException, IOException{
      
         ServletContext sc = request.getServletContext();
         
        //pega o valor inserido no formulario
         String nome = request.getParameter("nome");
         String senha = request.getParameter("senha");
         
         UsuarioDaoImpl UdaoImpl = new UsuarioDaoImpl();
         Usuario u = new Usuario();
         
          //seta o valor do formulario na variavel
         u.setNome(nome);
         u.setSenha(senha);
         RequestDispatcher rd = null;
         
         if(UdaoImpl.findByNomeUsuario(u) == true){
             HttpSession sessao = request.getSession();
             sessao.setAttribute("usuario", u);
             rd = request.getRequestDispatcher("/jsp/user.jsp");
             rd.forward(request, response);
         }
         else{
             request.setAttribute("mensagem", "usuario ou senha invalidos");
             rd = request.getRequestDispatcher("/jsp/index.jsp");
             rd.forward(request, response);
         }
         
        /* 
         UsuarioDao loginUsuario;
         loginUsuario = new UsuarioDaoImpl();
         
         Usuario u = new Usuario();
         u.setNome(nome);
         u.setSenha(senha);
         
         Usuario u = loginUsuario.findByNomeUsuario(u);
         
         if(u.getNome().equals(nome) && u.getSenha().equals(senha)){
            sc.getRequestDispatcher("/jsp/user.jsp").forward(request, response);
         }
         else{
            request.setAttribute("falhaAutenticacao", true);
            sc.getRequestDispatcher("/jsp/index.jsp").forward(request, response);           
        }   
         }*/
    }
}
