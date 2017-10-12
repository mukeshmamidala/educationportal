package sunspot.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sunspot.com.dao.LoginDao;
import sunspot.com.entity.User;
import sunspot.com.exception.MobileAlreadyRegistered;


/**
 * Servlet implementation class RegisterUserController
 */
@WebServlet("/registerUser")
public class RegisterUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//HttpSession session = request.getSession();
		RequestDispatcher dispatcher=null;
			
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			String role=request.getParameter("role");
			String mobile=request.getParameter("mobile");
			
			if(name==null || password==null || role==null || mobile==null){
				request.setAttribute("errorMsg",
						"Fields values are not correct !!");
				dispatcher = request.getRequestDispatcher("alert.jsp");
				dispatcher.forward(request, response);
				return;
			}
			
			User user=new User();
			user.setUserName(name);
			user.setPassword(password);
			user.setRole(role.toLowerCase());
			user.setUserId(Long.parseLong(mobile));
			
			
				try {
					boolean status=new LoginDao().addUser(user);
					if(status){
						request.setAttribute("errorMsg", "Thanks for register with us !! Now U can login to Education portal");
						dispatcher=request
						.getRequestDispatcher("portalRegister.jsp");
						dispatcher.forward(request, response);
					}
				} catch (MobileAlreadyRegistered e) {
					request.setAttribute("errorMsg", "Given Mobile is already registered please register with other number !!");
					dispatcher=request
					.getRequestDispatcher("alert.jsp");
					dispatcher.forward(request, response);
					e.printStackTrace();
				}	
			
			
		}
		
	}


