import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.print("Enter a positive integer: ");
            userInput = scanner.nextInt();
        } while (userInput <= 0);
        System.out.println("Valid input received: " + userInput);
    }
}