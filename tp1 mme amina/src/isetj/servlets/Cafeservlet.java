package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cafeservlet
 */
@WebServlet("/Cafeservlet")
public class Cafeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cafeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String r =request.getParameter("b1");
		String t =request.getParameter("t1");
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		out.println("<html><head><title></head></title>");
		out.println("<img src ='xxx.jfif' width='250' height='250'>");
		out.println("<br><p> merci de nous avoir fait parvenir la rq suivante concernant les prix praiqués  </p>");		
		out.println("<b>"+r+"</b>");
		out.println("<p>"+t+"</p>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
