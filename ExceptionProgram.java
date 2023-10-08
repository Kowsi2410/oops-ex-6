import java.util.Scanner;

public class ExceptionProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        try {
            System.out.print("The array values are : ");
            int[] numbers = {1, 2, 3, 4, 5};
            for(int num : numbers)
                System.out.print(num+" ");
            System.out.println("\n");
            System.out.print("Enter index: ");
            int index = scanner.nextInt();
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        try {
            System.out.print("Enter a number to be parsed : ");
            String input = scanner.next();

            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
        try {
            System.out.print("Enter a string: ");
            String input = scanner.next();
            System.out.print("Enter index: ");
            int index = scanner.nextInt();
            char character = input.charAt(index);
            System.out.println("Character at "+ index + " : " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
        scanner.close();
    }
}
