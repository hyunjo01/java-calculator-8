package calculator;

import calculator.controller.CalculatorController;
import calculator.parser.InputParser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        InputParser inputParser = new InputParser();
        CalculatorController calculatorController = new CalculatorController(inputView, outputView, inputParser);
        calculatorController.run();
    }
}
