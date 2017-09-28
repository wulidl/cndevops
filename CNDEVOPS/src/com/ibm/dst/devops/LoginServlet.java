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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // login judgment
        String login_name = null, login_password = null;
        login_name = request.getParameter("username");
        login_password = request.getParameter("password");
        
        System.out.println("login username:" + login_name);
        System.out.println("login password:" + login_password);
        
        String forward_url = null;
        String success_url = "/login_success.jsp";
        String failed_url = "/login_failed.jsp";
        
        if ("cndevops".equals(login_name) && "cndevops".equals(login_password)) {
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