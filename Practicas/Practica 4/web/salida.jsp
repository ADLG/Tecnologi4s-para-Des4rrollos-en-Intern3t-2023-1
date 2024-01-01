<%@page import="com.emergentes.modelo.Registro"%>
<%
    Registro item = (Registro)request.getAttribute("miregistro");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos recibidos, Formulario 1</h1>
        <p>Los datos recibidos son:</p>
        <ul>
            <li>Nombre: <%= item.getNombre() %> </li>
            <li>Telefono: <%= item.getTelefono()%> </li>
            <li>Fecha de nacimiento: <%= item.getfNac()%> </li>
        </ul>
        <a href="index.html">Volver al inicio</a>

    </body>
</html>
