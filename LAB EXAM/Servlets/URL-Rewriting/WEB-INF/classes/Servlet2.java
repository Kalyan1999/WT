import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
public class Servlet2 extends HttpServlet{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
{
         res.setContentType("text/html");

         PrintWriter out=res.getWriter();
         String name=req.getParameter("name");
         out.println("</h1>Hi"+name+"Good Moring");
                

} 
}
