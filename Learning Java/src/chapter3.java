//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class chapter3 {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you happy today");
        }


    }
}