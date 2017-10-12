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
import sunspot.com.exception.MobileAlreadyRegistered;
import sunspot.com.exception.TeacherNotFoundException;

/**
 * Servlet implementation class SearchTeacherController
 */
@WebServlet("/saveTeacherProfile")
public class TeacherProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TeacherProfileController() {
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
		String subject = request.getParameter("subject");
		String maxStudent = request.getParameter("maxStudent");
		int stdnumber = 0;
		if (subject != null)
			subject = subject.toLowerCase();

		if (maxStudent != null) {
			stdnumber = Integer.parseInt(maxStudent);
		}

		if (session == null) {
			request.setAttribute("errorMsg", "Session Expired !!");
			dispatcher = request.getRequestDispatcher("alert.jsp");
			dispatcher.forward(request, response);
			return;
		}

		User user = (User) session.getAttribute("user");
		TeacherPrefrences prefrences = new TeacherPrefrences();
		prefrences.setMaxStudent(stdnumber);
		prefrences.setSubjectType(subject);
		prefrences.setUser(user);

		boolean status = new StudentRequestDao()
				.addTeacherPrefrences(prefrences);

		request.setAttribute("errorMsg", "Profile Saved successfully");
		dispatcher = request.getRequestDispatcher("alertSuccess.jsp");
		dispatcher.forward(request, response);

	}

}
