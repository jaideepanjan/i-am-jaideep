package nava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/stala")
public class Location extends HttpServlet {

	public Location() {
		System.out.println("Running the Location details.." + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running the init in Location...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Runing the doPost method in Location...");

		String name = req.getParameter("nimmaHesaru");
		String emailId = req.getParameter("nimmaEmailId");
		String startPoint = req.getParameter("startingPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(emailId);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter write = resp.getWriter();

		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");

		if (name.length() > 3) {
			write.print("<span style='color:green'/>");
			write.print(" Name is valid " + name);
		} else {
			write.print("<span style='color:red'/>");
			write.print("Name is not vallid");
		}

		write.print("<br>");

		if (emailId.length() > 5) {
			write.print("<span style='color:green'/>");
			write.print(" Email is valid " + emailId);
		} else {
			write.print("<span style='color:red'/>");
			write.print("Email is not vallid");
		}

		write.print("<br>");

		if (startPoint.length() > 5) {
			write.print("<span style='color:green'/>");
			write.print(" Starting point is valid " + startPoint);
		} else {
			write.print("<span style='color:red'/>");
			write.print("Starting point is not vallid");
		}

		write.print("<br>");

		if (destination.length() > 5) {
			write.print("<span style='color:green'/>");
			write.print(" Destination is valid " + destination);
		} else {
			write.print("<span style='color:red'/>");
			write.print("Destination  is not vallid");
		}

		

		write.print("<br>");
		write.print("<a href=\"Contact.html\">Go back to Contact details</a>");
		write.print("<a href=\"index.html\">Back to home page</a>");
		write.print("</h1>");

		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");

	}

}
