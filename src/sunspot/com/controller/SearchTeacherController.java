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
@WebServlet("/searchTeacher")
public class SearchTeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		RequestDispatcher dispatcher=null;	
		String subject=request.getParameter("subject");
		
		if(subject!=null)
			subject=subject.toLowerCase();
			
		
		if(session==null){
			request.setAttribute("errorMsg",
					"Session Expired !!");
			dispatcher = request.getRequestDispatcher("alert.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		
		
		User user=(User)session.getAttribute("user");
				
		
					try {
						List<TeacherPrefrences> teacherList=new StudentRequestDao().getTeacherBySubject(subject);
						request.setAttribute("teacherList", teacherList);
						dispatcher=request
						.getRequestDispatcher("TeacherList.jsp");
						dispatcher.forward(request, response);
						
						
					} catch (TeacherNotFoundException e) {
						request.setAttribute("errorMsg", "OOPS !! There is no teacher for searched subject");
						dispatcher=request
						.getRequestDispatcher("alert.jsp");
						dispatcher.forward(request, response);
						}
	
		
		
	}

}
