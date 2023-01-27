package myself;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1, urlPatterns = "/your")
public class AboutYou extends HttpServlet {
	
	public AboutYou() {
		System.out.println("Running the about you...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running the init method in About you..");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the do get method in About you");
		
		String name=req.getParameter("yourName");
		String nickName=req.getParameter("nickName");
		String fatherName=req.getParameter("fatherName");
		String motherName=req.getParameter("motherName");
		String sibling=req.getParameter("sibling");
		String dob=req.getParameter("dob");
		String age=req.getParameter("age");
		String height=req.getParameter("height");
		String weight=req.getParameter("weight");
		String study=req.getParameter("study");
		String basicallyFrom=req.getParameter("basicallyFrom");
		String currentlyStaying=req.getParameter("currentlyStaying");
		String married=req.getParameter("married");
		String fevFood=req.getParameter("fevFood");
		String fevColor=req.getParameter("fevColor");
		String goal=req.getParameter("goal");
		String friendName=req.getParameter("friendName");
		String mobileNo=req.getParameter("mobileNo");
		String emailId=req.getParameter("emailId");
		String working=req.getParameter("working");		
		
		System.out.println(name);
		System.out.println(nickName);
		System.out.println(fatherName);
		System.out.println(motherName);
		System.out.println(sibling);
		System.out.println(dob);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(study);
		System.out.println(basicallyFrom);
		System.out.println(currentlyStaying);
		System.out.println(married);
		System.out.println(fevFood);
		System.out.println(fevColor);
		System.out.println(goal);
		System.out.println(friendName);
		System.out.println(mobileNo);
		System.out.println(emailId);
		System.out.println(working);
		
		PrintWriter fill=resp.getWriter();
		
		fill.print("<html>");
		fill.print("<body>");
		
		fill.print("<h3>");
		fill.print("<span style='color:red'>");
		fill.print("Your name is "+name);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:black'>");
		fill.print("Your nick name is "+nickName);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:bluee'>");
		fill.print("Your  father name is "+fatherName);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:green'>");
		fill.print("Your mother name is "+motherName);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:wheat'>");
		fill.print("Is you have siblig "+sibling);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:Purple'>");
		fill.print("Your date of birth is "+dob);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:pink'>");
		fill.print("Your age is "+age);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:maroon'>");
		fill.print("Your height is "+height);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:magenta'>");
		fill.print("Your weight is "+weight);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:teal'>");
		fill.print("Your study is "+study);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:cyan'>");
		fill.print("You basically from "+basicallyFrom);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:olive'>");
		fill.print("Currently staying in "+currentlyStaying);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:maroon'>");
		fill.print("Your married status "+married);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:violet'>");
		fill.print("Your fevretb food is "+fevFood);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:pink'>");
		fill.print("Your fevret color is "+fevColor);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:yellow'>");
		fill.print("Your goal is "+goal);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:red'>");
		fill.print("Your friend name is "+friendName);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:green'>");
		fill.print("Your Mobile number is "+mobileNo);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:blue'>");
		fill.print("Your email ID is "+emailId);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<h3>");
		fill.print("<span style='color:black'>");
		fill.print("Is you working "+working);
		fill.print("<span/>");
		fill.print("<h3/>");
		
		fill.print("<html/>");
		fill.print("<body/>");
		
		resp.setContentType("text/html");
		
		
		
		
	
	
	
	}

}
