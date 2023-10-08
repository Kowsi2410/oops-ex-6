package javaapplication23;
import java.util.Scanner;

class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}

class EmployeeMessages {
    public static final String[] ERROR_MESSAGES = {
        "Employee number must be numeric, between 1000 and 9999.",
        "Hourly pay rate must be numeric, between $9.00 and $25.00."
    };
}

public class JavaApplication23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int employeeNumber = getEmployeeNumber(scanner);
            double hourlyPayRate = getHourlyPayRate(scanner);
            displayMessage("Valid employee data");
        } catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int getEmployeeNumber(Scanner scanner) throws EmployeeException {
        System.out.print("Enter employee number: ");
        String input = scanner.nextLine();

        try {
            int employeeNumber = Integer.parseInt(input);
            if (employeeNumber < 1000 || employeeNumber > 9999) {
                throw new EmployeeException(EmployeeMessages.ERROR_MESSAGES[0]);
            }
            return employeeNumber;
        } catch (NumberFormatException e) {
            throw new EmployeeException(EmployeeMessages.ERROR_MESSAGES[0]);
        }
    }

    private static double getHourlyPayRate(Scanner scanner) throws EmployeeException {
        System.out.print("Enter hourly pay rate: ");
        String input = scanner.nextLine();

        try {
            double hourlyPayRate = Double.parseDouble(input);
            if (hourlyPayRate < 9.00 || hourlyPayRate > 25.00) {
                throw new EmployeeException(EmployeeMessages.ERROR_MESSAGES[1]);
            }
            return hourlyPayRate;
        } catch (NumberFormatException e) {
            throw new EmployeeException(EmployeeMessages.ERROR_MESSAGES[1]);
        }
    }

    private static void displayMessage(String message) {
        System.out.println(message);
    }
}

