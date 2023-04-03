<%-- 
    Document   : listaProductos
    Created on : 16-feb-2018, 19:04:57
    Author     : USUARIO
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
      </head>
      <body>
            <h1>LISTADO DE TODOS LOS PRODUCTOS</h1>
            <% ArrayList<Producto> productos = null;
                  productos= (ArrayList<Producto>)request.getAttribute("Productos");
            %>
            
            <table border>
                  <tr> <th>Id producto</th> <th>Nombre</th>  <th>Precio</th>  <th>cantidad</th>
                  </tr>
            <%
            for (Producto producto: productos)
            {
            %>
            
                   <td><%=producto.getClave() %></td>
                  <td><%=producto.getNombre() %></td>
                  <td><%=producto.getPrecio() %></td>
                  <td><%=producto.getCantidad() %></td>
                  </tr>
            <% } %>
      </table>
      <a href="index.jsp">Regresar a la pagina Principal</a>
      </body>
</html>
