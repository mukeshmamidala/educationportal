package sunspot.com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;


import sunspot.com.entity.TeacherPrefrences;
import sunspot.com.entity.User;
import sunspot.com.exception.MobileAlreadyRegistered;
import sunspot.com.util.DbConnector;

public class Test {

	/**
	 * @param args
	 * @throws MobileAlreadyRegistered
	 */

	// run to create all required DB table
	public static void main(String[] args) throws MobileAlreadyRegistered {
		DbConnector connector = DbConnector.getInstance();
		Session session = connector.getSession();

//		User user = new User();
//		user.setUserId(1l);
//		user.setPassword("123");
//		user.setRole("teacher");
//		user.setUserName("suraj");
//
//		SubjectType subjectType = new SubjectType();
//		subjectType.setSubId(1);
//		subjectType.setSubjectName("computer");
//
//		TeacherPrefrences prefrences=new TeacherPrefrences();
//		prefrences.setId(1l);
//		prefrences.setMaxStudent(10);
//		prefrences.setSubjectType(subjectType);
//		prefrences.setUser(user);
//		
//		//ad.setParent(s);
//
//		Transaction transaction = session.beginTransaction();
//		//session.save(user);
//		session.save(prefrences);
//		
//		transaction.commit();
//		session.close();

		// try {
		// User user=new LoginDao().isvalidUser(8019508912l);
		// System.out.println(user.getUserName());
		// } catch (UserNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

}
