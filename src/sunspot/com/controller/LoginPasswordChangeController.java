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
@WebServlet("/changepassword")
public class LoginPasswordChangeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginPasswordChangeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession(false);
		RequestDispatcher dispatcher = null;

		String userId = request.getParameter("userId");
		String newPwd = request.getParameter("newPwd");
		String confrmPwd = request.getParameter("confrmPwd");
		
		if(!newPwd.equals(confrmPwd)){
			request.setAttribute("status","Both password are not same !!");
			dispatcher = request.getRequestDispatcher("ForgotPassword.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		long uid=Long.valueOf(userId);
		

			LoginDao loginDao=new LoginDao();
			boolean isValidUser = loginDao.isValidAccount(uid);
			
			if(isValidUser){
				loginDao.chnangePasswrod(uid, newPwd);
				request.setAttribute("status","Password change successfully !!");
				dispatcher = request.getRequestDispatcher("ForgotPassword.jsp");
				dispatcher.forward(request, response);
				return;	
				
			}else{
				request.setAttribute("status","User Id is not valid !!");
				dispatcher = request.getRequestDispatcher("ForgotPassword.jsp");
				dispatcher.forward(request, response);
				return;	
			}
	}

}
