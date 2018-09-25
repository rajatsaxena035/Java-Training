

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String book = request.getQueryString();
		if(book==null) book = "";
		String s = "<html>" +
					"<body>" +
						"<h1>Buy Books</h1>" +
						"<form method='post' action='AddToCartServlet?"+book+"'>" +
							"<ol>"+
								"<li>"+
									"<input type='checkbox' name='book', value='Java' />Java"+
								"</li>"	+
								"<li>"+
									"<input type='checkbox' name='book', value='Python' />Python"+
								"</li>"	+
								"<li>"+
									"<input type='checkbox' name='book', value='C++' />C++"+
								"</li>"	+
							"</ol>" +
							"<input type='submit' value='add to cart'>" +
						"</form>" +
					"</body>" +
					"</html>" ;
		PrintWriter out = response.getWriter();
		out.print(s);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PrintWriter out = response.getWriter();
		out.print("<html><body><h2>Books in the cart</h2>");
		String books[] = request.getParameterValues("book");
		String book = request.getParameter("pbook");
		int j = 0;
		if(book!=null)
		{
			String pbooks[] = book.split(",");
			for(j = 0; j<pbooks.length; j++)
			{
				out.print(pbooks[j]+"<br>");
			}
		}
		if(books!=null)
		{
			for(int i = 0; i<books.length; i++)
			{
				out.print(books[i]+"<br>");
				if(book==null) {book="";}
				else book=book+",";
				book = book+books[i];	
			}
		}
		out.print("<a href='AddToCartServlet?pbook="+book+"'>Add more</a></body></html>");
	}
}
