import javax.servlet.http.*;
   import java.io.*;
     import javax.servlet.*;
     import javax.servlet.RequestDispatcher;
 
 
    public class AddServlet extends HttpServlet {
         public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
             res.setContentType("text/html");
             PrintWriter out = res.getWriter(); 
 
            String n = req.getParameter("name");
             String v = req.getParameter("value");
             res.addCookie(new Cookie(n, v));
             out.println("Added Item: " + n + " to cart"); 
 
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
             rd.include(req, res);
         }
     }
 
