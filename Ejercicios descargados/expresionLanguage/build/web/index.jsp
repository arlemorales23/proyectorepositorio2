<%-- 
    Document   : index
    Created on : 06-mar-2018, 21:05:52
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Ejemplo Expression Language</title>
    </head>
    <body>
        <h1>Ejemplo de Expression Language</h1>
        <br>
        <a href="variablesImplicitas.jsp?usuario=juan">Objetos implicitos con EL</a>
        <br>
        <br>
        <!--Entramos al JSP que accede al JavaBean -->
        Formulario HTML:
        <br>
        <form name="form1" action="accesoJavaBeans.jsp">
            Base:<input type="text" name="base" />
            <br> <br>
            Altura:<input type="text" name="altura" />
            <input type="submit" value="Enviar" />
        </form>

    </body>
</html>
