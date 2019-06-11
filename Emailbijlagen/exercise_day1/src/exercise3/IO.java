package exercise3;

import java.util.Scanner;

public class IO {

    private Scanner scanner;

    public IO() {
        scanner = new Scanner(System.in);
    }

    public int askNumber(String question) {
        System.out.println(question);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
        }
        return 0;
    }

    public String askOperator() {
        System.out.println("Give the operator e.g.: +-*/");
        return scanner.next();
    }

    public void printFunction(int firstNumber, String operator, int secondNumber, int result) {
        System.out.println("Result: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
    }
}
