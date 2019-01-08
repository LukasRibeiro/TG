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

@WebServlet(urlPatterns = {"/Excluir"})
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
        rd = request.getRequestDispatcher("/jsp/index.jsp");
        rd.forward(request, response);
    }
    else{
        request.setAttribute("mensagem", "erro ao excluir usuario");
        rd = request.getRequestDispatcher("/jsp/excluir.jsp");
        rd.forward(request, response);
    }
    }
}
