package pickle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;

@WebServlet(loadOnStartup = 1,urlPatterns = "/favorite")
public class FevretPerson extends HttpServlet{
	
	public FevretPerson() {
		System.out.println("running default method of Fevret Porsion "+getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String nickName=req.getParameter("nickName");
		String gender=req.getParameter("gender");
		String reason=req.getParameter("reason");
		String address=req.getParameter("address");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(nickName);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Display.jsp");
		req.setAttribute("firstName", firstName);
		req.setAttribute("lastName", lastName);
		req.setAttribute("nickName", nickName);
		req.setAttribute("gender", gender);		
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
		
		requestDispatcher.forward(req,resp);
	}
	
	


}
