package com.xworkz.kingsize.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(loadOnStartup = 2,urlPatterns = "/allagi")
public class QueenServlet extends HttpServlet {
	
	public QueenServlet() {
		System.out.println("running the queen");	}

}
