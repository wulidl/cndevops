package com.ibm.dst.devops;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // register judgment
        String register_name = null, register_password = null;
        register_name = request.getParameter("new_user_name");
        register_password = request.getParameter("new_user_password");
        
        System.out.println("register username:" + register_name);
        System.out.println("register password:" + register_password);
        
        String forward_url = null;
        String success_url = "/register_success.jsp";
        String failed_url = "/register_failed.jsp";
        
        if ("cndevops".equals(register_name) && "cndevops".equals(register_password)) {
        	forward_url = success_url;
        }
        else {
        	forward_url = failed_url;
        }
        
        try {
            RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher(forward_url);
            requestDispatcher.forward(request, response);
            
        } finally {            
            out.close();
        }
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		processRequest(request, response);
	}
}