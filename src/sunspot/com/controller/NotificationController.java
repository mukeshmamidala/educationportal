package sunspot.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sunspot.com.dao.LoginDao;
import sunspot.com.dao.StudentRequestDao;
import sunspot.com.entity.TeacherPrefrences;
import sunspot.com.entity.User;
import sunspot.com.entity.UserNotification;
import sunspot.com.exception.MobileAlreadyRegistered;
import sunspot.com.exception.TeacherNotFoundException;

/**
 * Servlet implementation class SearchTeacherController
 */
@WebServlet("/notification")
public class NotificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NotificationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		RequestDispatcher dispatcher = null;

		if (session == null) {
			request.setAttribute("errorMsg", "Session Expired !!");
			dispatcher = request.getRequestDispatcher("alert.jsp");
			dispatcher.forward(request, response);
			return;
		}

		User user = (User) session.getAttribute("user");
		String action = request.getParameter("action");
		
			List<UserNotification> notifications = new StudentRequestDao().getMessage(user.getUserId());
		
			if(notifications!=null){
				
			request.setAttribute("notifications", notifications);
			
			
			//new StudentRequestDao().updateSeenStatus(user.getUserId());
			
			if(action.equals("teacher")){
				dispatcher = request.getRequestDispatcher("TeacherMessageList.jsp");
				dispatcher.forward(request, response);
			}
			
			if(action.equals("student")){
				dispatcher = request.getRequestDispatcher("StudentMessageList.jsp");
				dispatcher.forward(request, response);
			}
			
		} else {
			request.setAttribute("errorMsg",
					"OOPS !! There is no message for you.");
			dispatcher = request.getRequestDispatcher("alert.jsp");
			dispatcher.forward(request, response);
		}

	}

}
