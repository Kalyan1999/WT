import java.io.IOException;
     import java.io.PrintWriter;
     import javax.servlet.*; 
 
    public class MyFilter implements Filter {
         public void init(FilterConfig arg0) throws ServletException {
         } 
 
        public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
             PrintWriter out = res.getWriter();
             String name = req.getParameter("name"); 
            String pwd = req.getParameter("pwd"); 
 
            if (name.equalsIgnoreCase("admin") && pwd.equals("admin")) {
                 chain.doFilter(req, res);
             }
        else {
                 out.print("<html><body><h1>Username or Password Invalid!</h1></body></html>");
             }
         } 
 
        public void destroy() {         }
     } 