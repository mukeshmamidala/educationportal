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
@WebServlet("/requestTeacher")
public class RequestToTeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RequestToTeacherController() {
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
		String tid = request.getParameter("tid");
		String subjectType=request.getParameter("subjectType");

		if(subjectType!=null && subjectType!=""){
			subjectType=subjectType.toLowerCase();
		}
		
		long teacherId = 0l;
		if (tid != null)
			teacherId = Long.valueOf(tid);

		if (session == null) {
			request.setAttribute("errorMsg", "Session Expired !!");
			dispatcher = request.getRequestDispatcher("alert.jsp");
			dispatcher.forward(request, response);
			return;
		}

		User user = (User) session.getAttribute("user");
		StudentRequestDao requestDao= new StudentRequestDao();
		
		UserNotification notification = new UserNotification();
		notification.setReceiverName(requestDao.getUserName(teacherId));
		notification.setSenderName(user.getUserName());
		notification.setSeenStatus(0);
		notification.setSender(user.getUserId());
		notification.setReceiver(teacherId);
		notification.setCourse(subjectType);
		notification.setApprovalstatus(0);
		notification.setMsgDescription("Dear "+user.getUserName()+" wants to join the "+ subjectType +" course please approve the request.");

		requestDao.requestToTeacher(notification);

		request.setAttribute("errorMsg", "Your request has been successfully submitted !!");
		dispatcher = request.getRequestDispatcher("alertSuccess.jsp");
		dispatcher.forward(request, response);

	}

}
