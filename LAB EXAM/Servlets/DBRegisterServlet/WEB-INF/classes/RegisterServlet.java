import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class RegisterServlet extends HttpServlet
{
	Connection con=null;
	Statement psmt=null;
	
	public void init()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","kalyan","kalyan");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		try
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			String email=req.getParameter("email");
			
			psmt=con.createStatement();
			
			/*psmt.setString(1,username);
			psmt.setString(2,password);
			psmt.setString(3,email);*/
			
			psmt.executeUpdate("insert into userinfo values('"+username+"','"+password+"','"+email+"')");
			
			pw.println("<h1>Registration is Successful</h1>");
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void destroy()
	{
		try
		{
			con.close();
			psmt.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	//Localhost Used: http://localhost:8085/register/register.html
		//Copy the ojdbc14.jar file into lib folder of tomcat.
		
	//Deploy the Servlet Folder into "webapps" folder of the "tomcat" directory
}