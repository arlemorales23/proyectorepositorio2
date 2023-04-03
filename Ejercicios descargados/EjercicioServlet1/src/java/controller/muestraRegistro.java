/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocios.Alumno;

/**
 *
 * @author USUARIO
 */
@WebServlet(name = "muestraRegistro", urlPatterns = {"/muestraRegistro"})

public class muestraRegistro extends HttpServlet {

      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                 String nombre =request.getParameter("nombre");
                 String apellidos =request.getParameter("apellidos");
                 Double promedio= parseDouble(request.getParameter("prom"));
                 
                  Alumno alumno=new Alumno(nombre, apellidos, promedio);
                 
                 
                 out.println("<!DOCTYPE html>");
                  out.println("<html>");
                  out.println("<head>");
                  out.println("<title>Servlet muestraRegistro</title>");                  
                  out.println("</head>");
                  out.println("<body>");
                  out.println("<h1>Servlet muestraRegistro 1320668 " + request.getContextPath() + "</h1>");
                  out.println("<h2>Este es el servlet muestraRegistro.java</h2>");
                  out.println("<h3>A continuacion se muestran los parametros  recibidos</h3>");
                  out.println(alumno);
                  out.println("</body>");
                  out.println("</html>");
            }
      }
      
      @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
                  throws ServletException, IOException{
                   processRequest(request,  response);
      }
                  
            
      }

      // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
      /**
       * Handles the HTTP <code>GET</code> method.
       *
       * @param request servlet request
       * @param response servlet response
       * @throws ServletException if a servlet-specific error occurs
       * @throws IOException if an I/O error occurs
       */


      /**
       * Handles the HTTP <code>POST</code> method.
       *
       * @param request servlet request
       * @param response servlet response
       * @throws ServletException if a servlet-specific error occurs
       * @throws IOException if an I/O error occurs
       */

      /**
       * Returns a short description of the servlet.
       *
       * @return a String containing servlet description
       */
