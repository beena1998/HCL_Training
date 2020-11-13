package appexception;

public class UserDefinedException extends Exception {

	@Override
	public String getMessage() {
		
		return super.getMessage();
	}
	public String notPositive() {
		return "Not Positive";
	}

}
