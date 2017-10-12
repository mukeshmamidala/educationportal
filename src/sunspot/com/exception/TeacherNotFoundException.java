package sunspot.com.exception;

public class TeacherNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeacherNotFoundException() {
		super("Teacher does not exist in for given subject.");
	}
}
