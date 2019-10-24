import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
public class Servlet2 extends HttpServlet{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
{
         res.setContentType("text/html");
         PrintWriter out=res.getWriter();
        HttpSession hs=req.getSession(false);
            if(hs==null){
                              out.println("<h2>no session is available</h2>");
	              }else
                             {
                                Enumeration e =hs.getAttributeNames();
	               out.println("<table border=2><tr><th>Session  Attribute Name</th><th>Session  Attribute value</th></tr>");
                              while(e.hasMoreElements())
		{
		  String n=(String)e.nextElement();
                                      String v=(String)hs.getAttribute(n);
		   out.println("<tr><td>"+n+"</td><td>"+v+"</td></tr>");
		}	
                             }

} 
}
