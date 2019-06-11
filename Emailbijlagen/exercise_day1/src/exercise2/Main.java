package exercise2;

import java.util.Scanner;

public class Main {

    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.startExercise2();
    }

    public void startExercise2() {
        int firstNumber = askNumber("What is the first number?");
        int secondNumber = askNumber("What is the second number?");

        String operator = askOperator();

        int result = -999999;

        // TODO set the variable result based on the value of operator.
        //  Use the add, subtract, multiply, and divide methods. The add method is implemented, use 'else if' statements
        //  to implement the additional methods
        if (operator.equals("+")) {
            result = add(firstNumber, secondNumber);
        }

        System.out.println("Result: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
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

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
