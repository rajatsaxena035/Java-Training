

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String music[] = request.getParameterValues("music");
		String book[] = request.getParameterValues("book");
		HttpSession session = request.getSession();
		ArrayList<Object> cart = (ArrayList<Object>)session.getAttribute("cart");
		if(cart==null)
		{
			cart = new ArrayList<Object>();
			
		}
		if(music!=null) for(int i=0;i<music.length;i++) cart.add(music[i]);
		if(book!=null) for(int i=0;i<book.length;i++) cart.add(book[i]);
		session.setAttribute("cart", cart);
		PrintWriter out = response.getWriter();
		out.print("Added to the cart<br>");
		out.print("<a href ='ShowServlet?flag=c'>Show Cart </a><br/>");
		out.print("<a href ='ShowServlet?flag=i'>Show and invalidate session </a><br/>");
		out.print("<a href ='books.html'>Books</a><br/>");
		out.print("<a href ='music.html'>Music</a><br/>");
		out.close();
	}

}
