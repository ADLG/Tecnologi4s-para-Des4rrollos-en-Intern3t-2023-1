/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.controlador;

import com.emergentes.modelo.Registro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** @author ADLG*/
@WebServlet(name = "ProvesaServlet", urlPatterns = {"/ProvesaServlet"})
public class ProvesaServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter o = response.getWriter();
        String nombre = request.getParameter("nombre");
        String sexo = request.getParameter("Sexo");
        String estudio = request.getParameter("Nivel de estudios");
        
        try {
            o.println("<!DOCTYPE html>");
            o.println("<html>");
            o.println("<head>");
            o.println("<title>Los Datos son:</title>");
            o.println("</head>");
            o.println("<body>");
            o.println("<h3>Tu Nombre es: "+nombre+"</h3>");
            o.println("<h3>Tu Sexo es: "+sexo+"</h3>");
            o.println("<h3>Tu Nivel de estudios es: "+estudio+"</h3>");
            o.println("<a href=\"JSP.jsp\">Volver al inicio</a>");
            o.println("</body>");
            o.println("</html>");
            
        } finally {o.close();}
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String fNac = request.getParameter("fNac");
        Registro reg = new Registro();
        
        reg.setNombre(nombre);
        reg.setTelefono(telefono);
        reg.setfNac(fNac);
        
        request.setAttribute("miregistro", reg);
        request.getRequestDispatcher("salida.jsp").forward(request, response);
        
    }
}
