package servlets;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TimeServlet")
public class TimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TimeServlet() {
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<head>");
		out.println("<title>Time Servlet</title>");
		out.println("The time is: " + new java.util.Date());
		out.println("<body>");
		out.println("<body bgcolor=\"#7FB3D5\">");
		
		String user = request.getHeader("user-agent");
		out.println("<h3 align=center>User-Agent Browser</h3>");
		out.println("<table border=2 align=center width=75%>");
		out.println("<tr bgcolor=\"#45B39D\"><th>Header Name</th><th>Value</th></tr>");
		out.println("<tr bgcolor=\"#76D7C4\"><th>user-agent: " +"</th><th>" + user +"</th></tr>");
		out.println("</table>");
		out.println("<br/>");
		out.println("</body>");
		out.println("</html>");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		PrintWriter out = response.getWriter();
		String un = request.getParameter("un");
		String sect= request.getParameter("sect");
		String date = request.getParameter("date");
		
			out.println("<h3 align=center>User Infomation</h3>");
			out.println("<table border=2 align=center width=50%>");
			out.println("<tr><th bgcolor=\"#45B39D\">Name:</th><th bgcolor=\"#76D7C4\">" + un + "</th></tr>");
			out.println("<tr><th bgcolor=\"#45B39D\">Section:</th><th bgcolor=\"#76D7C4\">" + sect + "</th></tr>");
			out.println("<tr><th bgcolor=\"#45B39D\">Date Submitted:</th><th bgcolor=\"#76D7C4\">" + date + "</th></tr>");
			out.println("</table>");
			out.println("<br/>");
	}
}