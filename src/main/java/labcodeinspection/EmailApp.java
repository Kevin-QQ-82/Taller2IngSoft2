package labcodeinspection;
import java.util.Scanner;
@SuppressWarnings("PMD.UseUtilityClass")
/**
 * Main application class for handling email operations.
 */
public class EmailApp {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        try {
            final System.out.print("Enter your first name: ");
            String firstName = sc.nextLine();
            System.out.print("Enter your last name: ");
            final String lastName = sc.nextLine();
            
            final Email email = new Email(firstName, lastName);
            email.setDepartment(1); // Ejemplo de uso
            email.showInfo();
        } finally {
            sc.close(); // Asegura que el Scanner se cierre
        }
    }
}

