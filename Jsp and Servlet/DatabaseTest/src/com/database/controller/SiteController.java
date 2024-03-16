package com.database.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.database.Entity.UserDetail;
import com.database.Model.UserDetailModel;

@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SiteController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String page = request.getParameter("page");
     
		switch (page) {
	case "listusers":
		listuser(request, response);
		break;
	case "addusers":
        request.getRequestDispatcher("adduser.jsp").forward(request, response);
		break; 
	case "useradded":
        adduser(request, response);
		break;
	case "delete":
        deleteuser(request, response);
		break;
	case "update":
		request.getRequestDispatcher("updateuser.jsp").forward(request, response);
		break;
		
	case "userupdated":
		updateuser(request, response);
		break;
		default:
		request.getRequestDispatcher("index.jsp").forward(request, response);			break;
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void adduser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name  = request.getParameter("Name");
		String Email = request.getParameter("Email");
		UserDetailModel.adduser(new UserDetail(name, Email));
		listuser(request, response);
	}
	protected void listuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<UserDetail> listuser = UserDetailModel.listOfUsers();
		request.setAttribute("users", listuser);
        request.getRequestDispatcher("listuser.jsp").forward(request, response);
	}
	protected void updateuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name  = request.getParameter("Name");
		String Email = request.getParameter("Email");
		String id = request.getParameter("ID");
		   int ID= Integer.parseInt(id);
		UserDetailModel.updateuser(new UserDetail(ID,name, Email));
		listuser(request, response);
	}
	protected void deleteuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String id = request.getParameter("id");
	   int ID= Integer.parseInt(id);
	   System.out.println("deleteuser method called in controller");
		UserDetailModel.deleteuser(new UserDetail(ID));
		listuser(request, response);
	}
}
