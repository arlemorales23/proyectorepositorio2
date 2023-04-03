<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<%@ page import="com.example.controller.muestraRegistro" %>
<div class="container">
    <h1>Hola! Proporciona tus datos:</h1>
    <form action="/alumnos/muestraRegistro" method="post">
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">@</span>
            <input type="text" class="form-control" placeholder="Nombres" aria-label="Username"
                   aria-describedby="basic-addon1" name="nombre">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon2">@</span>
            <input type="text" class="form-control" placeholder="Apellidos" aria-label="Username"
                   aria-describedby="basic-addon1" name="apellidos">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon3">@</span>
            <input type="text" class="form-control" placeholder="Promedio" aria-label="Username"
                   aria-describedby="basic-addon1" name="promedio">
        </div>
        <div class="btn-group" role="group" aria-label="Basic example">
            <div class="col-12">
                <button class="btn btn-primary" type="submit">Borrar</button>
            </div>
            <div class="col-12">
                <button class="btn btn-primary" type="submit">enviar</button>
            </div>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
        crossorigin="anonymous"></script>
</body>
</html>