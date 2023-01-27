package republic;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/cinima")
public class WebSeries extends HttpServlet {

	public WebSeries() {
		System.out.println("Running webseries...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running the init method in WebSeries....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the get method in webseries..");

		String name = req.getParameter("webSeriesName");
		String language = req.getParameter("language");
		String episodes = req.getParameter("episodes");
		String ott = req.getParameter("ott");
		String budjet = req.getParameter("budjet");

		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budjet);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		
		write.print("<h4>");
		write.print("<span style='color:green'>");
		write.print("web series name is " + name);
		write.print("</span>");
		write.print("</h4>");

		write.print("<h4>");
		write.print("<span style='color:red'>");
		write.print("web series language   " + language);
		write.print("</span>");
		write.print("</h4>");

		write.print("<h4>");
		write.print("<span style='color:blue'>");
		write.print("web series episode  " + episodes);
		write.print("</span>");
		write.print("</h4>");

		write.print("<h4>");
		write.print("<span style='color:yellow'>");
		write.print("is web series is ott platform " + ott);
		write.print("</span>");
		write.print("</h4>");

		write.print("<h4>");
		write.print("<span style='color:pink'>");
		write.print("web series budjet  " + budjet);
		write.print("</span>");
		write.print("</h4>");

		write.print("</body>");
		write.print("</html>");

		resp.setContentType("text/html");

	}

}
