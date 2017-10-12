package sunspot.com.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sunspot.com.dao.LoginDao;
import sunspot.com.dao.StudentRequestDao;
import sunspot.com.entity.User;
import sunspot.com.exception.UserNotFoundException;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		RequestDispatcher dispatcher = null;
		if(session==null){
			request.setAttribute("errorMsg",
					"Session Expired !!");
			dispatcher = request.getRequestDispatcher("alert.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
			User us = (User) session.getAttribute("user");
			
			boolean status=new StudentRequestDao().isAnyMessage(us.getUserId());
			request.setAttribute("isMsg", status);
			
			if(us != null){
				if (us.getRole().equals("student")) {
					
					dispatcher = request.getRequestDispatcher("Student.jsp");
					dispatcher.forward(request, response);
					return;
				}
				if (us.getRole().equals("teacher")) {
					
					dispatcher = request.getRequestDispatcher("Teacher.jsp");
					dispatcher.forward(request, response);
					return;
				}
			}
				request.setAttribute("errorMsg",
						"Session Expired !!");
				dispatcher = request.getRequestDispatcher("alert.jsp");
				dispatcher.forward(request, response);
				return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		User user = null;



		String userId = request.getParameter("uId");
		String pwd = request.getParameter("uPwd");
		try {
			user = new LoginDao().isvalidUser(Long.parseLong(userId), pwd);
		} catch (NumberFormatException e) {
			request.setAttribute("errorMsg",
					"Incorrect User Id / Password or User is not registered !!");
			dispatcher = request.getRequestDispatcher("alert.jsp");
			dispatcher.forward(request, response);
			return;

		} catch (UserNotFoundException e) {
			request.setAttribute("errorMsg",
					"Incorrect User Id / Password or User is not registered !!");
			dispatcher = request.getRequestDispatcher("alert.jsp");
			dispatcher.forward(request, response);
			return;
		}

		session.setAttribute("user", user);
		request.setAttribute("errorMsg",
				"User Authentication done valid User continue by clicking the button !!");
		dispatcher = request.getRequestDispatcher("portalLogin.jsp");
		dispatcher.forward(request, response);
		return;

	}

}
