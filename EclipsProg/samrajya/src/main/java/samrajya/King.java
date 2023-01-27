package samrajya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/kingdom")
public class King extends HttpServlet{
	
	public King() {
		System.out.println("Running the kingdom....");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("running the init method in King..");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running thr get method in King...");
		
		String name=req.getParameter("nameOfKing");
		String region=req.getParameter("region");
		String noOfQueens=req.getParameter("noOfQueens");
		String dob=req.getParameter("dateOfBirth");
		String dod=req.getParameter("dateOfDeath");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(dob);
		System.out.println(dod);
		
		PrintWriter write=resp.getWriter();
		
		write.print("<html>");
		write.print("<body>");
		
		write.print("<h3>");
		write.print("<span style='color:pink'>");
		write.print("name of the King is "+name);
		write.print("<span/>");
		write.print("<h3/>");
		
		write.print("<h3>");
		write.print("<span style='color:black'>");
		write.print("region of the King is "+region);
		write.print("<span/>");
		write.print("<h3/>");

		write.print("<h3>");
		write.print("<span style='color:red'>");
		write.print("No of queens  "+noOfQueens);
		write.print("<span/>");
		write.print("<h3/>");
		
		write.print("<h3>");
		write.print("<span style='color:green'>");
		write.print("King's date of birth "+dob);
		write.print("<span/>");
		write.print("<h3/>");
		
		write.print("<h3>");
		write.print("<span style='color:white'>");
		write.print("King's date of death  "+dod);
		write.print("<span/>");
		write.print("<h3/>");
		
		write.print("<body/>");
		write.print("<html/");
		
		resp.setContentType("text/html");
		
		
	}
	

}
