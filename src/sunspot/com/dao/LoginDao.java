package sunspot.com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import sunspot.com.entity.User;
import sunspot.com.exception.MobileAlreadyRegistered;
import sunspot.com.exception.UserNotFoundException;
import sunspot.com.util.DbConnector;

public class LoginDao {

	Session session;
	DbConnector connector;

	public LoginDao() {
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
	public User isvalidUser(long userID, String pwd)
			throws UserNotFoundException {

		if (!session.isConnected())
			session = connector.getSession();

		User user = (User) session.get(User.class, userID);
		if (user == null) {
			throw new UserNotFoundException();
		}
		if (user.getPassword().equals(pwd)) {
			session.close();
			return user;
		} else {
			session.close();
			throw new UserNotFoundException();
		}
	}

//	public UserMessage isAnyMessage(long userID) throws UserNotFoundException {
//
//		if (!session.isConnected())
//			session = connector.getSession();
//
//		UserMessage userMessage = (UserMessage) session.get(UserMessage.class,
//				userID);
//		if (userMessage == null) {
//			return null;
//		}
//		if (userMessage.getMsgSeen() == 0) {
//
//			Transaction transaction = session.beginTransaction();
//			userMessage.setMsgSeen(1);
//			transaction.commit();
//			session.close();
//			return userMessage;
//		} else {
//			session.close();
//			return null;
//		}
//	}

//	public void requestToTeacher(long senderID, long receiverID)
//			throws UserNotFoundException {
//
//		if (!session.isConnected())
//			session = connector.getSession();
//
//		UserMessage userMessage = new UserMessage();
//		User sender = new User();
//		User receiver = new User();
//		sender.setUserId(senderID);
//		receiver.setUserId(receiverID);
//		userMessage.setMsgSeen(0);
//		userMessage.setMsgDescription("Student : " + senderID
//				+ " is requesting you");
//
//		Transaction transaction = session.beginTransaction();
//		session.save(userMessage);
//		transaction.commit();
//		session.close();
//
//	}
	
//	public void teacherApproved(long senderID, long receiverID)
//			throws UserNotFoundException {
//
//		if (!session.isConnected())
//			session = connector.getSession();
//
//		UserMessage userMessage = new UserMessage();
//		User sender = new User();
//		User receiver = new User();
//		sender.setUserId(senderID);
//		receiver.setUserId(receiverID);
//		userMessage.setMsgSeen(0);
//		userMessage.setMsgDescription("Teacher has approved you request !!! Enjoy Learning");
//
//		Transaction transaction = session.beginTransaction();
//		session.save(userMessage);
//		transaction.commit();
//		session.close();
//
//	}
//	
	
	

	/**
	 * @param user
	 * @return boolean use add user
	 * @throws MobileAlreadyRegistered
	 */
	public synchronized boolean addUser(User user)
			throws MobileAlreadyRegistered {

		
		if (!session.isConnected())
			session = connector.getSession();
		
		User fetchedUser = null;

		fetchedUser = (User) session.get(User.class, user.getUserId());

		if (fetchedUser != null) {
			session.close();
			throw new MobileAlreadyRegistered();
		} else {
			
			Transaction transaction = session.beginTransaction();	
			session.save(user);
			transaction.commit();
			session.close();
			return true;
		}

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