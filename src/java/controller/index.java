package controller;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class index extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ServletContext sc = request.getServletContext();
        try{
        sc.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
    }catch(Exception e){
         System.out.println("erro" + e);
        }
    }
}