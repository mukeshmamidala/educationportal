package sunspot.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import sunspot.com.entity.TeacherPrefrences;
import sunspot.com.entity.User;
//import sunspot.com.entity.UserMessage;
import sunspot.com.entity.UserNotification;
import sunspot.com.exception.MobileAlreadyRegistered;
import sunspot.com.exception.TeacherNotFoundException;
import sunspot.com.exception.UserNotFoundException;
import sunspot.com.util.DbConnector;

public class StudentRequestDao {

	Session session;
	DbConnector connector;

	public StudentRequestDao() {
		connector = DbConnector.getInstance();
		session = connector.getSession();
	}

	/**
	 * @param userID
	 * @return User
	 * @throws UserNotFoundException
	 * 
	 * 
	 */
	public List<TeacherPrefrences> getTeacherBySubject(String subjectId)
			  throws TeacherNotFoundException{

		if (!session.isConnected())
			session = connector.getSession();

		Query query = session.createQuery("from TeacherPrefrences where subjectType = :subjectType ");
		query.setParameter("subjectType", subjectId);
		@SuppressWarnings("unchecked")
		List<TeacherPrefrences> teacherList = (List<TeacherPrefrences>)query.list();
		
		
//		@SuppressWarnings("unchecked")
//		List<TeacherPrefrences> teacherList =  (List<TeacherPrefrences>) session.get(TeacherPrefrences.class, subjectId);
		if (teacherList == null || teacherList.size()==0) {
			session.close();
			throw new TeacherNotFoundException();
		}else{
			session.close();
			return teacherList;
		}		
	}

	

	public boolean updateSeenStatus(long userId,String course) {

			if (!session.isConnected()) {
				session = connector.getSession();
			}
			
			Transaction transaction = session.beginTransaction();

			Query query = session.createQuery("from UserNotification where sender = :sender and seenStatus = 0 and course=:course");
			query.setParameter("sender", userId);
			query.setParameter("course", course);
			
			List<UserNotification> userMessage = query.list();

			for (UserNotification userNotification : userMessage) {
				userNotification.setSeenStatus(1);
				session.save(userNotification);
			}
			transaction.commit();
			session.close();
			return true;
	}
	
	
	public boolean isAnyMessage(long userID) {

		if (!session.isConnected())
			session = connector.getSession();

		Query query = session.createQuery("from UserNotification where receiver = :receiver and SeenStatus = 0");
		query.setParameter("receiver", userID);
		
		List<UserNotification> userMessage = query.list();
		
		if (userMessage == null || userMessage.size()==0) {
			session.close();
			return false;
		}else{
			session.close();
			return true;
		}
	}

	public List<UserNotification> getMessage(long userID) {

		if (!session.isConnected())
			session = connector.getSession();

		Query query = session.createQuery("from UserNotification where receiver = :receiver and SeenStatus = 0");
		query.setParameter("receiver", userID);
		
		@SuppressWarnings("unchecked")
		List<UserNotification> userMessage = query.list();
		
		if (userMessage == null || userMessage.size()==0) {
			session.close();
			return null;
		}else{
			session.close();
			return userMessage;
		}
	}
	
	public List<UserNotification> getAllStudent(long userID) {

		if (!session.isConnected())
			session = connector.getSession();

		Query query = session.createQuery("from UserNotification where sender = :sender and approvalstatus = 1");
		query.setParameter("sender", userID);
		
		@SuppressWarnings("unchecked")
		List<UserNotification> userMessage = query.list();
		
		if (userMessage == null || userMessage.size()==0) {
			session.close();
			return null;
		}else{
			session.close();
			return userMessage;
		}
	}	

	public List<UserNotification> getAllTeacher(long userID) {

		if (!session.isConnected())
			session = connector.getSession();

		Query query = session.createQuery("from UserNotification where receiver = :receiver and approvalstatus = 1");
		query.setParameter("receiver", userID);
		
		@SuppressWarnings("unchecked")
		List<UserNotification> userMessage = query.list();
		
		if (userMessage == null || userMessage.size()==0) {
			session.close();
			return null;
		}else{
			session.close();
			return userMessage;
		}
	}
	
	
	
	
	public String getUserName(long userID)
			 {

		if (!session.isConnected())
			session = connector.getSession();

		User user = (User) session.get(User.class, userID);
		session.close();
		return user.getUserName();
		
	}
	
	public boolean requestToTeacher(UserNotification notification) {
		
		if (!session.isConnected())
			session = connector.getSession();
		
		Transaction transaction = session.beginTransaction();
		session.save(notification);
		transaction.commit();
		session.close();
		return true;

	}
	
	public void teacherApproved(UserNotification notification){

		if (!session.isConnected())
			session = connector.getSession();


//		Transaction transaction = session.beginTransaction();
//		session.save(userMessage);
//		transaction.commit();
//		session.close();

	}
	
	
	

	/**
	 * @param user
	 * @return boolean use add user
	 * @throws MobileAlreadyRegistered
	 */
	public boolean addTeacherPrefrences(TeacherPrefrences prefrences)
			{

		
		if (!session.isConnected())
			session = connector.getSession();
		

			
			Transaction transaction = session.beginTransaction();	
			session.save(prefrences);
			transaction.commit();
			session.close();
			return true;
		

	}

	public boolean isValidAccount(long userId) {

		if (!session.isConnected())
			session = connector.getSession();

		User user = (User) session.get(User.class, userId);
		if (user == null) {
			session.close();
			return false;
		} else {
			session.close();
			return true;
		}
	}

	public boolean chnangePasswrod(long userId, String chngPwd) {

		boolean status = isValidAccount(userId);
		if (status) {
			if (!session.isConnected()) {
				session = connector.getSession();
			}
			Transaction transaction = session.beginTransaction();
			User user = session.get(User.class, userId);
			if (user != null) {
				user.setPassword(chngPwd);
			}
			transaction.commit();
			session.close();
			return true;
		}
		session.close();
		return false;

	}
}