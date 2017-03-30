package preferences;

/**
 * @author nmk263
 *
 * The purpose of this class is to get and set the users personal data. This will allow for easier distinction between customers
 * when the customer data is written to a file to be saved.
 *
 */

public class UserInfo {
	
	private String firstName;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
