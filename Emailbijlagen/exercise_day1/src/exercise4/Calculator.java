package exercise4;

public class Calculator {

    int result;

    public void performCalculation(int firstNumber, String operator, int secondNumber) {
        if (operator.equals("+")) {
            result = add(firstNumber, secondNumber);
        } else if (operator.equals("-")) {
            result = subtract(firstNumber, secondNumber);
        } else if (operator.equals("*")) {
            result = multiply(firstNumber, secondNumber);
        } else if (operator.equals("/")) {
            result = divide(firstNumber, secondNumber);
        } else {
            result = -999999;
        }
    }

    public int getResult() {
        return result;
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
