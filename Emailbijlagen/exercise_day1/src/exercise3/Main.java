package exercise3;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.startExercise3();
    }

    public void startExercise3() {
        IO inputOutput = new IO();

        int firstNumber = inputOutput.askNumber("What is the first number?");
        int secondNumber = inputOutput.askNumber("What is the second number?");

        String operator = inputOutput.askOperator();

        Calculator calc = new Calculator();
        calc.performCalculation(firstNumber, operator, secondNumber);

        // TODO get the result variable from the Class Calculator
        int result = -999999;

        inputOutput.printFunction(firstNumber, operator, secondNumber, result);
    }
}
