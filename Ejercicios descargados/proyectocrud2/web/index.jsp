<%-- 
    Document   : index
    Created on : 14-feb-2018, 16:43:28
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"
content="text/html; charset=UTF-8">
<title> Index </title>
</head>
<body>
<%@ page import="controller.registro" %>
<h2>Hola! Proporciona los datos </h2>
<h2> del producto</h2>
<form action="registro" method="post">
<table cellspacing="3" cellpadding="3" border="1" >
<tr>
<td align="right"> Clave: </td>
<td><input type="text" name="clave"></td>
</tr>
<tr>
<td align="right"> Nombre: </td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td align="right"> Precio: </td>
<td> <input type="text" name="precio"> </td>
</tr>
<tr>
<td align="right"> Cantidad: </td>
<td> <input type="text" name="cant"> </td>
</tr>
</table>
<input type="reset" value="Borrar">
<input type="submit" value="Registrar">
</form>
<form action="muestraProductos" method="POST">
<input type="submit" value="Ver Productos">
</form>
</body>
</html>
      