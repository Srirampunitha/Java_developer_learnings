package com.sriram.mvctest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SiteController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = request.getParameter("page");
		switch (page) {
		case "listusers":
			request.getRequestDispatcher("listusers.jsp").forward(request, response);
			break;

		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}