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

@WebServlet(urlPatterns = {"/Excluir"})
public class Excluir extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, ServletException, IOException, IOException{
    
    ServletContext sc = request.getServletContext();
    
    String ra = request.getParameter("ra");
    
    Usuario usuario = new Usuario();
    usuario.setRa(ra);
    
    UsuarioDao excluirUsuario;
    excluirUsuario = new UsuarioDaoImpl();
    
    boolean status = false;
    excluirUsuario.Excluir(usuario);
    
    if(status){
            sc.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
       }
        else {
            request.setAttribute("erro ao excluir", 1);
            sc.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
        }
    }
}
