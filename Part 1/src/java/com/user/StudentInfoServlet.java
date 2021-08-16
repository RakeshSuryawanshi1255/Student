/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user;

import armdb.SQLUpdateException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Rakesh Suryawanshi
 */
public class StudentInfoServlet extends HttpServlet {
DBConnn DB=new DBConnn();
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StudentInfoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Insert Data Successefully..!</h1>");
            
            
            String Fname = request.getParameter("fname");
            String Lname = request.getParameter("lname");
            String Mname = request.getParameter("mname");
            String Country = request.getParameter("countryname");
            String State = request.getParameter("statename");
            String City = request.getParameter("cityname");
            String Zip = request.getParameter("zipcode");
            String Email = request.getParameter("emailidname");
            String Code = request.getParameter("coden");
            String Mno = request.getParameter("phoneno");
            
            out.println();
            out.println("<h3> First Name :-"+ Fname+"</h3>");
            out.println("<h3>  Last Name :-"+ Lname+"</h3>");
            out.println("<h3>Middel Name :-"+ Mname+"</h3>");
            out.println("<h3>Address :- Country : "+ Country +"</h3>");
            out.println("<h3>State : "+ State +"</h3>");
            out.println("<h3>City : "+ City  +"Zip code :"+Zip+"</h3>");
            out.println("<h3>Email Id : "+ Email +"</h3>");
            out.println("<h3>Mobile No : "+ Code +" "+Mno+"</h3>");
            
           
            
            
            
            try {        
                DB.nonQuery("INSERT INTO `studenrtable`(`fname`, `lname`, `mname`, `country`, `state`, `city`, `zipcode`, `email`, `cntrycode`, `mobileno`) VALUES ('" + Fname + "','" + Lname + "','" + Mname + "','" + Country + "','" + State + "','" + City + "','" + Zip + "','" + Email + "','" + Code + "','" + Mno + "')");
               
                System.out.println("Data inserting.......");
            } catch (SQLUpdateException ex) {
                Logger.getLogger(StudentInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
               
            }
            
            
            out.println("</body>");
            out.println("</html>");
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
