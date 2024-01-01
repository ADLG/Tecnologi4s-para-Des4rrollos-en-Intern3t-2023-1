Tecnologias para Desarrollos en Internet

Proyecto FormStudentValidation 

ADLG
JGJMP

Comentarios. 
Nuestro proyecto lo hicimos en SpringToolSuite4 con las siguientes caracteristicas:
Maven Project
Java
Spring Boot 2.7.6
Packaging War
Java 11

Dependencias:
Spring Web
Thymeleaf
Spring Boot DevTools
Spring Data JPA

Puerto:8080
Base de datos utilizada MariaDB, la base fue llamada tdi, las tablas usadas estan en los archivos .sql.
Se pueden cargar los archivos con la codificación UTF-8.

Para ejecutar debemos hacer lo siguiente.
- Importar el proyecto en maven. 
- Sobre el directorio raiz del programa hacer click derecho -> Run as -> Spring Boot App
- Dirigirnos en el navegador a la ruta http://localhost:8080/
- Todos los datos se almacenaran en la base de datos.