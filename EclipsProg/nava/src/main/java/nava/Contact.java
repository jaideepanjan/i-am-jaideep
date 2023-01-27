package nava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/samparka")
public class Contact extends HttpServlet {

	public Contact() {
		System.out.println("Running the Contact details...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running the init method in Contact ");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		String name=req.getParameter("yourName");
		String email=req.getParameter("emailId");
		String mobileNo=req.getParameter("dooravaniSankye");
		Long convLong=Long.parseLong(mobileNo);
		String comments=req.getParameter("abipraya");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobileNo);
		System.out.println(comments);
		
		PrintWriter write=resp.getWriter();
		
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		
		if(name.length()>3) {
			write.print("<span style='color:green'/>");
			write.print(" Name is valid "+name);
		}
		else {
			write.print("<span style='color:red'/>");
			write.print("Name is not vallid");
		}
		
		write.print("<br>");
		
		if(email.length()>5) {
			write.print("<span style='color:green'/>");
			write.print(" Email is valid "+email);
		}
		else {
			write.print("<span style='color:red'/>");
			write.print("Email is not vallid");
		}
		
		write.print("<br>");
		
		if(convLong>100000) {
			write.print("<span style='color:green'/>");
			write.print(" Mobile Number is valid "+mobileNo);
		}
		else {
			write.print("<span style='color:red'/>");
			write.print("Mobile number is not vallid");
		}
		
		write.print("<br>");
		
		if(comments.length()>15) {
			write.print("<span style='color:green'/>");
			write.print(" Comments is valid "+comments);
		}
		else {
			write.print("<span style='color:red'/>");
			write.print("Comments is not vallid");
		}
		
		write.print("<br>");
		write.print("<a href=\"Location.html\">Go back to Location details</a>");
		write.print("<a href=\"index.html\">Back to home page</a>");
		write.print("</h1>");
		
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
		
	}

}
