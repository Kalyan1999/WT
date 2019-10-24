import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
public class Servlet1 extends HttpServlet{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
{
         res.setContentType("text/html");
         PrintWriter out=res.getWriter();
         String name=req.getParameter("name");
       out.println("<h2>Welcome to Cvr collge of enginnering</h2>");
       out.println("<a href =test2?name="+name+">Click to get User Name</a>");
 } 
}
