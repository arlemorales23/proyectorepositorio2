package com.example.controller;

import com.example.modelo.Alumno;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "muestraRegistro", value = "/muestraRegistro")
public class muestraRegistro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
                String nombre= request.getParameter("nombre");
                String apellidos= request.getParameter("apellidos");
                Double promedio = Double.parseDouble(request.getParameter("prom"));
                Alumno alumno = new Alumno(nombre,apellidos,promedio);
                request.setAttribute("pasaobjeto", alumno);
                RequestDispatcher rd = request.getRequestDispatcher("muestraDatos.jsp");
                rd.forward(request,response);

    }
}

