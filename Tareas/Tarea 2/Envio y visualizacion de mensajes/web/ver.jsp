<%@ page import="javabeans.*,java.util.*"%>
<html>
  <head>
    <title>Ver Mansajes</title>
  </head>
<body>
<center>    
<%String nombre = request.getParameter( "nombre" );%>
<h1>
  Mensajes para <%= nombre %>
</h1>
<table border=1>
<tr><th>Remitente</th><th>Mensaje</th><th>Fecha</th><th>¿Eliminar?</th></tr>
<%boolean men = false;
ArrayList mensajes = (ArrayList)request.getAttribute( "mensajes" );
if( mensajes != null )
  // Si existen mensajes para ese destinatario,
  // se generará una tabla con los mismos:
  for( int i=0; i<mensajes.size(); i++ ) {
    Mensaje m = (Mensaje)mensajes.get(i);
    if (( m.getDestino()).equalsIgnoreCase( nombre )) {
      men = true;%>
      <tr><td><%= m.getRemite()%></td>
          <td><%= m.getTexto()%></td>
          <td><%= m.getFechaActual()%></td>
          <td>
          
              <form action="controlador?operacion=borra" method="post">
              <input type="submit" value="<%=m.getFechaActual()%>" name="Eliminar">
          </form>
          </td>
      </tr>
    <%}
  }
if ( !men ) {%>
    <!-- Si no hay mensajes se envía al usuario
    a la página de nomensajes.jsp -->
    <jsp:forward page="nomensajes.jsp"/>
<%}%>
</table>
<br/><br/>
<h1><b><a href="inicio.htm">Inicio</a></b></h1>
</center>
</body>
</html>
