<%-- 
    Document   : index
    Created on : 15-feb-2018, 8:36:57
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
      </head>
      <body>
            <%@page import="controller.muestraRegistro"%>
            <h1>Hola! Proporciona tus datos</h1>
            <form action="muestraRegistro" method="post">
                  <table cellspacing="3" cellpadding="3" border="1">
                        <tr> <td aling="rigth">Nombre:</td> <td><input type ="text" name="nombre"></td></tr>
                        <tr> <td aling="rigth">Apellidos:</td> <td><input type ="text" name="apellidos"></td></tr>
                        <tr> <td aling="rigth">Promedio:</td> <td><input type ="text" name="prom"></td></tr>
                  </table>
                  <input type="reset" value="Borrar">
                  <input type="submit" value="Enviar">
            </form>
      </body>
</html>
