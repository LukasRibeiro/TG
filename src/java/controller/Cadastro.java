package controller;

import dao.UsuarioDao;
import daoImpl.UsuarioDaoImpl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

@WebServlet(urlPatterns = {"/cadastro"})
public class Cadastro extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, ServletException, IOException, IOException, IOException{
        
        ServletContext sc = request.getServletContext();
        
        //pega o valor inserido no formulario
        String nome = request.getParameter("nome");
        String ra = request.getParameter("ra");
        String senha = request.getParameter("senha");
        
        UsuarioDao novoUsuario;
        novoUsuario = new UsuarioDaoImpl();
        
        //seta o valor do formulario na variavel
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setRa(ra);
        usuario.setSenha(senha);
        
        boolean status = false;
        status = novoUsuario.inserir(usuario);
        
       if(status){
            response.sendRedirect("/");
       }
        else {
            request.setAttribute("erroNoCadastro", 1);
            response.sendRedirect("/cadastro");
       }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, IOException, IOException{
        
        RequestDispatcher rd;
            
         rd = request.getRequestDispatcher("/jsp/cadastro.jsp");
        try{
            rd.forward(request, response);
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
