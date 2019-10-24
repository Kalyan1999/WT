import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.RequestDispatcher;
public class Servlet1 extends HttpServlet{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
{
         res.setContentType("text/html");
         PrintWriter out=res.getWriter();
        HttpSession hs=req.getSession();
       if(hs.isNew()){
                              out.println("<h2>New Session got created with session ID:"+hs.getId()+"</h2>");
	            }
                              else
                             {
                                out.println("<h2>Existing Session only using  with session ID:"+hs.getId()+"</h2>");
                             }
         String n=req.getParameter("name");
         String v=req.getParameter("value");
         hs.setAttribute(n,v);
         RequestDispatcher rd = req.getRequestDispatcher("index.html");
         rd.include(req,res);

} 
}
