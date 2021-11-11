/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.learning;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 88017
 */
public class FormServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            String name= request.getParameter("user_name");
            String password= request.getParameter("user_password");
            String address= request.getParameter("user_address");
            String cards= request.getParameter("cards");
            String books= request.getParameter("books");
            String gender= request.getParameter("user_gender");
            String food[]= request.getParameterValues("favorite_food");
            
            
            
            
            if(request.getParameter("submit")!=null)
            {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Your login:" + name + "</h1>");
            out.println("<h1>Your password:" + password + "</h1>");
            out.println("<h1>Your address:" + address + "</h1>");
            out.println("<h1>Your card:" + cards + "</h1>");
            out.println("<h1>Your Interest include "+"<ul>" +"<li>"+ books +"</li>"+ "</ul>"+ "</h1>");
            out.println("<h1>Your gender:" + gender + "</h1>");
            out.println("<h1>please choose favorite foods</h1>");
            for (int i=0;i<food.length;i++)
            {
                out.println("<h1>"+"<ul>" +"<li>"+ food[i] +"</li>"+ "</ul>"+ "</h1>");
            }
            
            
            out.println("</body>");
            out.println("</html>");
            }
            
            
            
        } 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
