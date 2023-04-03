/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

@WebServlet(name = "registro", urlPatterns = {"/registro"})
public class registro extends HttpServlet {
protected void processRequest(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
try ( PrintWriter out = response.getWriter()) {
            int clave = Integer.parseInt(request.getParameter("clave"));
            String nombre= request.getParameter("nombre");
            Double precio = Double.parseDouble(request.getParameter("precio"));
            int cant = Integer.parseInt(request.getParameter("cant"));

            GestorBD gestorBD = new GestorBD();
            if (gestorBD.registrar(clave, nombre, precio, cant)){
            request.getRequestDispatcher("/registroGuardado.jsp")
            .forward(request, response);
            }
      else
      request.getRequestDispatcher("/errorEnRegistro.jsp")
      .forward(request, response);
}
}
      @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
            processRequest(request, response);
      }

      /**
       * Returns a short description of the servlet.
       *
       * @return a String containing servlet description
       */
    
}
