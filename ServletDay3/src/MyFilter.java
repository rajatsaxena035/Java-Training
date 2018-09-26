import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns="/servlet1")
public class MyFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {}
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException
	{
		PrintWriter out = resp.getWriter();
		out.print("filter is invoked before");
		chain.doFilter(req, resp);
		out.print("filter is invoked after");
	}
	public void destroy()
	{
		
	}
}
