package preferences;

/**
 * @author nmk263
 *
 * This class is used to get and set the parameter value for each possible notification channel
 */

public class MyPreference {
		
		private String userEmail;

		private long userPhoneNumber;

		private static final String Application = "NSB";

		
		

		/**
		 * @return the userEmail
		 */
		public String getUserEmail() {
			return userEmail;
		}

		/**
		 * @param userEmail the userEmail to set
		 */
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		/**
		 * @return the userPhoneNumber
		 */
		public long getUserPhoneNumber() {
			return userPhoneNumber;
		}

		/**
		 * @param userPhoneNumber the userPhoneNumber to set
		 */
		public void setUserPhoneNumber(int userPhoneNumber) {
			this.userPhoneNumber = userPhoneNumber;
		}

		/**
		 * @return the application
		 */
		public static String getApplication() {
			return Application;
		}

		

		

		
		
		

	}



