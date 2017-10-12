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
@WebServlet("/notificationDetail")
public class NotificationDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NotificationDetailController() {
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
		String sendTo = request.getParameter("sendTo");
		String course=request.getParameter("course");
		
		long receiverId = 0l;
		if (sendTo != null)
			receiverId = Long.valueOf(sendTo);
		
		StudentRequestDao studentRequestDao=new StudentRequestDao();
		UserNotification notification = new UserNotification();
		notification.setSeenStatus(0);
		notification.setSender(user.getUserId());
		notification.setReceiver(receiverId);
		notification.setCourse(course);
		notification.setReceiverName(studentRequestDao.getUserName(receiverId));
		notification.setSenderName(user.getUserName());
		if(action.equals("approved")){
			notification.setMsgDescription("Your request has been approved !!");
			notification.setApprovalstatus(1);
			studentRequestDao.updateSeenStatus(receiverId,course);
		}
		if(action.equals("reject")){
			studentRequestDao.updateSeenStatus(receiverId,course);
			notification.setMsgDescription("Your request has been rejected !!");
			notification.setApprovalstatus(0);
		}
		
		
		boolean status = studentRequestDao.requestToTeacher(notification);

		request.setAttribute("errorMsg", "We have sent your message to user !!");
		dispatcher = request.getRequestDispatcher("alertSuccess.jsp");
		dispatcher.forward(request, response);

	}

}
