

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(); 
		String qs1 = (String) session.getAttribute("qs1");
		String qs2 = (String) session.getAttribute("qs2");
		String qs3 = (String) session.getAttribute("qs3");
		
		String qn = request.getParameter("q");
		int param = Integer.parseInt(qn);
		String quesMap;
		QuestionSet qs = new QuestionSet();
		if(param==1)
		{
			quesMap = qs1;
		}
		else if(param==2)
		{
			quesMap = qs2;
		}
		else
		{
			quesMap = qs3;
		}
		Question qqq = qs.getQuestion(quesMap);
		
		String ss;
		if(request.getParameter("n")!=null)
		{
			ss = "a"+(Integer.valueOf(param-1));
			session.setAttribute(ss,request.getParameter("ans"));
		}
		if(request.getParameter("p")!=null)
		{
			ss = "a"+(Integer.valueOf(param+1));
			session.setAttribute(ss,request.getParameter("ans"));
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body><h3>Question: "+qn+"</h3>");
		out.print("<br>"+qqq.statement);
		out.print("<br><form method='post'>");
		out.print("<br><input type='radio' name='ans' value='y'> Yes");
		out.print("<br><input type='radio' name='ans' value='n'> No");
		if(param==1)
		{
			out.print("<br><br><input type='submit' name='n' formaction='Display?q=2' value='Next'>");
		}
		else if(param==2)
		{
			out.print("<br><br><input type='submit' name='p' formaction='Display?q=1' value='Previous'>");
			out.print("<br><br><input type='submit' name='n' formaction='Display?q=3' value='Next'>");
		}
		else
		{
			out.print("<br><br><input type='submit' name='p' formaction='Display?q=2' value='Previous'>");
			out.print("<br><br><input type='submit' name='n' formaction='Result' value='Finish'>");
		}
		out.print("</body></html>");
	}

}
