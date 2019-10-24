import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*; 
 
    public class AdminServlet extends HttpServlet {
         public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             response.setContentType("text/html"); 
 
            PrintWriter out = response.getWriter(); 
 
            out.print("<html><head><title>Admin Page</title></head><body><h1>Welcome Admin</h1></body> </html>");
             out.close();
         }
     } 