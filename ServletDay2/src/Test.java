

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int r[] = new int[3];
		int i=0; int j;
		while(i<3)
		{
			r[i] = 1 + rn.nextInt(10 - 1 + 1);
			for(j=0; j<i; j++)
			{
				if(r[j]==r[i]) break;
			}
			if(i==j)
			{
				System.out.println(r[i]);
				i++;
			}
		}
		HttpSession session=request.getSession(); 
		session.setAttribute("qs1", Integer.toString(r[0]));
		session.setAttribute("qs2", Integer.toString(r[1]));
		session.setAttribute("qs3", Integer.toString(r[2]));
		request.getRequestDispatcher("/Display?q=1").forward(request, response);
	}

}
