import javax.servlet.http.*;
     import java.io.*;
     import java.util.*;
     import javax.servlet.*; 
 
    public class CartServlet extends HttpServlet {
         public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
             res.setContentType("text/html");
             PrintWriter out = res.getWriter();
             Cookie cookies[] = req.getCookies(); 
 
            if (cookies == null)
                 out.println("<h2>No Items in Cart</h2>");
             else {
                 out.println("<table border=2><tr> <th>Session Attribute Name</th><th>Session Attribute Value</th></tr>"); 
 
                for(int i = 0; i < cookies.length; i++) {
                     String n = cookies[i].getName();
                     String v = cookies[i].getValue();
                     out.println("<tr><td>" + n + "</td><td>" + v + "</td></tr>");
                 }
             }
         }
     } 