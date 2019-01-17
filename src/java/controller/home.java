package controller;

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

@WebServlet(name = "home", urlPatterns = {"/home"})
public class home extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher rd = null;
             
        HttpSession session=request.getSession(false);
        
         if(session.getAttribute("usuario")== null){
             rd = request.getRequestDispatcher("/jsp/index.jsp");
             //rd.forward(request,response);
             response.sendRedirect("/");
         }
         else{
         rd = request.getRequestDispatcher("/jsp/user.jsp");
        try{
            rd.forward(request, response);
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
}
   