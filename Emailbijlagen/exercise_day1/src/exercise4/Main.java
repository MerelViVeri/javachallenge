package exercise4;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.startExercise4();
    }

    public void startExercise4() {
        // Instantiate the support classes
        IO inputOutput = new IO();
        Calculator calc = new Calculator();

        doWork(inputOutput, calc);
    }

    public void doWork(IO inputOutput, Calculator calc) {
        // Get the input values for the calculation
        int firstNumber = inputOutput.askNumber("What is the first number?");
        int secondNumber = inputOutput.askNumber("What is the second number?");
        String operator = inputOutput.askOperator();

        // perform the actual calculation and get the result
        calc.performCalculation(firstNumber, operator, secondNumber);
        int result = calc.getResult();

        // Nicely print to standard out
        inputOutput.printFunction(firstNumber, operator, secondNumber, result);
    }
}
