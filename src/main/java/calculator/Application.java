package calculator;

import calculator.controller.CalculatorController;
import calculator.parser.InputParser;
import calculator.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        InputParser inputParser = new InputParser();
        CalculatorController calculatorController = new CalculatorController(inputView, inputParser);
        calculatorController.run();
    }
}
