import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4,urlPatterns = "/forever")
public class Agrja extends HttpServlet {
	
	public Agrja() {
		System.out.println("agraja is alwaya  with me");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Thanks for beaing a main pillor of my life");
	}

}

