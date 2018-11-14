
package com.mycompany.controler;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PreguntasHO extends HttpServlet { //Public es un modificador de clase, no es modificador de acceso
   
    @Override //Es una notación 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)//Protected en este caso si es un modificador de acceso, HTTPServelet son parámetros de entrada: request es de lado clienteservidor, response, el servidor WEB es el que proporciona los objetos request y response
         throws ServletException, IOException { 
         response.setContentType("text/xhtml;charset=UTF-8"); //indica que se esta trabajando con una página html
         PrintWriter out = response.getWriter(); // se recupera el objeto out que nos permite establecer el canal de comunicación con el cliente, indicamos que enviaremos un flujo de salida de texto
           //aquí ya se manda a imprimir lo que la página 
            out.println("<?xml version='1.0' encoding='UTF-8' ?>");
            out.println("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>");
            out.println("<html xmlns='http://www.w3.org/1999/xhtml'");
            out.println("xmlns:h='http://xmlns.jcp.org/jsf/html'");
            out.println("xmlns:p='http://primefaces.org/ui'>");
            out.println("<h:head>");
            out.println("<title>PreguntasProfe</title>");            
            out.println("</h:head>");
            out.println("<h:body>");
            out.println("<p:outputLabel value='LOGIN' />");
            out.println("</h:body>");
            out.println("</html>");
        }
    }

    