package labcodeinspection;

import java.util.logging.Level;
import java.util.logging.Logger;

@SuppressWarnings("PMD.UseUtilityClass")

/**
*
*
* @author Kevin
*/

public class Email { //NOPMD class comments are too long to explain this class
    private static final Logger log = Logger.getLogger(Email.class.getName());//NOPMD its already log

    private final String m_firstName; //NOPMD its already manipulated
    private final String m_lastName;  //NOPMD its already manipulated
    private String password = ""; 	//NOPMD its already manipulated
    private String department;		//NOPMD its already manipulated
    private final int defaultPasswordLength = 8; //NOPMD its already manipulated
    private String email; //NOPMD its already manipulated

    /**
     * Constructor to initialize first name and last name.
     * 
     * @param firstName the first name of the user
     * @param lastName  the last name of the user
     */
    public Email(final String firstName, final String lastName) {
        this.m_firstName = firstName;
        this.m_lastName = lastName;
    }

    /**
     * Displays the information of the email.
     */
    public void showInfo() {
        if (log.isLoggable(Level.INFO)) {
            log.info(String.format("\nFIRST NAME= %s\nLAST NAME= %s", m_firstName, m_lastName));
            log.info(String.format("DEPARTMENT= %s\nEMAIL= %s\nPASSWORD= %s", department, email, password));
        }

    /**
     * Sets the department based on user choice.
     * 
     * @param depChoice the choice of department
     */
    public void setDepartment(int depChoice) {  //NOPMD THIS METOD WILL BE USED IN THE FUTURE
        switch (depChoice) {
            case 1:S
                this.department = "sales";
                break;
            case 2:
                this.department = "dev";
                break;
            case 3:
                this.department = "acct";
                break;
            default:
                throw new IllegalArgumentException("Invalid department choice.");
        }
    }

    /**
     * Generates a random password of the specified length.
     * 
     * @param length the length of the password
     * @return a random password
     */
    private String randomPassword(final int length) { //NOPMD THIS METOD WILL BE USED IN THE FUTURE
        final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
        final char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            final int rand = (int) (Math.random() * set.length());
            password[i] = set.charAt(rand);
        }
        return new String(password);
    }

}

