<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="css/jquery-3.3.1.min">
      <title> Index </title>
</head>
<body>
<%@ page import="Controller.registro" %>
            <h2>Hola! Proporciona los datos de tu  producto </h2>
           
  <script>
            function valida() {
                  if(document.forma.clave.value ==="")
                               alert("falta introducir la clave");
                  else{
                  if(document.forma.nombre.value ==="")
                           alert("falta introducir el nombre");
                  else{
                  if(document.forma.precio.value ==="")
                                alert("faltafunction introducir el precio");
                  else{
                  if(document.forma.cant.value ==="")
                               alert("falta introducir la cantidad");
                  else
                        forma.submit();
                  }}}
                  }
</script>
   <form  name= "forma" action="registro" method="post">
            <table cellspacing="3" cellpadding="3" border="1" >
                  <tr> <td align="right"> Clave: </td>  <td><input type="text" name="clave"></td></tr>
                  <tr><td align="right"> Nombre: </td> <td><input type="text" name="nombre"></td></tr>
                  <tr> <td align="right"> Precio: </td> <td> <input type="text" name="precio"> </td></tr>
                  <tr><td align="right"> Cantidad: </td> <td> <input type="text" name="cant"> </td></tr>
            </table>
            <input type="reset" value="Borrar">
            <input type="button" value="Registrar" onclick="return valida();">
            <br>
 </form>
            <form action="muestraProductos" method="POST">
            <input type="submit" value="Ver Productos">
            </form>
            </body>
</html>
