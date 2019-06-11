package exercise1;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.startExercise1();
    }

    public void startExercise1() {
        int firstNumber = 20;
        int secondNumber = 10;

        int added = add(firstNumber, secondNumber);
        int subtracted = subtract(firstNumber, secondNumber);
        int multiplied = multiply(firstNumber, secondNumber);
        int divided = divide(firstNumber, secondNumber);

        System.out.println("Result of addition:       " + firstNumber + " + " + secondNumber + " = " + added);
        System.out.println("Result of subtraction:    " + firstNumber + " - " + secondNumber + " = " + subtracted);
        System.out.println("Result of multiplication: " + firstNumber + " * " + secondNumber + " = " + multiplied);
        System.out.println("Result of division:       " + firstNumber + " / " + secondNumber + " = " + divided);
    }

    public int add(int firstNumber, int secondNumber) {
        // TODO add the two numbers and return
        return -999999;
    }

    public int subtract(int firstNumber, int secondNumber) {
        // TODO subtract the secondNumber from the firstNumber, and return
        return -999999;
    }

    public int multiply(int firstNumber, int secondNumber) {
        // TODO multiply both numbers and return
        return -999999;
    }

    public int divide(int firstNumber, int secondNumber) {
        // TODO divide the firstNumber by the secondNumber, and return
        return -999999;
    }
}
