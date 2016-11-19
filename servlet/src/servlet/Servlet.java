/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Janghun
 */
@SuppressWarnings("serial")
public class Servlet extends HttpServlet{
 
     public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException{
         resp.setContentType("text/html; charset=UTF-8");   
         PrintWriter out = resp.getWriter();
         out.println("<html><head><title>MY Servlet</title></head>");
         out.println("<body>");
         out.println("<h2>My IP:" + req.getRemoteAddr() + "</h2>");
         out.println("<h2>My Host:" + req.getRemoteHost() + "</h2>");
         out.println("<h2>Request URI" + req.getRequestURI() + "</h2>");
         out.println("</body></html>");
     }
}