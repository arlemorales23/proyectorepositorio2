<%-- 
    Document   : variablesImplicitas
    Created on : 06-mar-2018, 21:10:04
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">  <title>El y Variables Implicitas</title>
    </head>
    <body>
        <h1>EL y Variables Implicitas</h1>
        <ul>
            <li>Nombre Aplicación: ${pageContext.request.contextPath}</li>
            <li>Navegador del Cliente: ${ header["User-Agent"] }
            <li>Id Session: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}
            <li>Valor Parametro Usuario: ${param["usuario"]}</li>
        </ul>

        <br>
        <br>
        <a href="index.jsp">Regresar al Inicio</a>

    </body>
</html>

