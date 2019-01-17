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

@WebServlet(urlPatterns = {"/excluir"})
public class Excluir extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, ServletException, IOException, IOException{
    
    ServletContext sc = request.getServletContext();
    
    String ra = request.getParameter("ra");
    
    UsuarioDao excluirUsuario;
    excluirUsuario = new UsuarioDaoImpl();
    
    Usuario u = new Usuario();
    u.setRa(ra);
    RequestDispatcher rd = null;
    
    if(excluirUsuario.Excluir(u) == true){
        HttpSession sessao = request.getSession();
        sessao.setAttribute("usuario", u);
        response.sendRedirect("/");
    }
    else{
        request.setAttribute("mensagem", "erro ao excluir usuario");
        response.sendRedirect("/excluir");
    }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException{
        RequestDispatcher rd = null;
            
         rd = request.getRequestDispatcher("/jsp/excluir.jsp");
        try{
            rd.forward(request, response);
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
