<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html lang="es">
  <head>
  	<meta http-equiv="content-Type" content="text/html; charset=UTF-8">
  	<title>Practica 4.5</title>

  	<style type="text/css"><%@include file="../css/estilos jsp.css"%></style>

  </head>

  <body>
    <a href="index.html" class="inicio">INICIO</a>
    <h1>Java Server Page</h1>
    <%="Pagina para el funcionamiento del JSP"%>
    <%="<h1>JSP</h1>"%>

    <%="Hoy es:"%>
    <% Date date = new Date();%>
    <%= date%>

    <%! String str = "Este es un String";%>
    <%= "<br><br>"+str+"<br>"%>
    
    <%="Este es un double"%>
    <%! Double flo = 3.1416;%>
    <%= flo%>
    
    <p> Ciclo for </p>
    <% for (int i=0; i<3; i++){%>
    	<p> iteracion numero = <%= i%>.</p>
    <% } %>

    <h1>Formulario 1</h1>
    <form action="ProvesaServlet" method="post">
        <label>Nombre</label><input type="text" name="nombre"><br>
        <label>Telefono</label><input type="text" name="telefono"><br>
        <label>Fecha de nacimiento</label><input type="text" name="fNac"><br>
        <input type="submit" value="Enviar">
    </form>
    
    <h1>Formulario 2</h1>
    <form action="ProvesaServlet" method="get">
        <label>Nombre</label><input type="text" name="nombre"><br>
        <select name="Sexo">
            <option value="Hombre">Hombre</option>
            <option value="Mujer">Mujer</option>
        </select><br>
        <select name="Nivel de estudios">
            <option value="Primaria">Primaria</option>
            <option value="Secundaria">Secundaria</option>
            <option value="Preparatoria">Preparatoria</option>
            <option value="Licenciatura">Licenciatura</option>
        </select><br>
        <input type="submit" value="Enviar">
    </form>
    
  </body>
</html>
