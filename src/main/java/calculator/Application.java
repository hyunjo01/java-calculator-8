package calculator;

import calculator.controller.CalculatorController;
import calculator.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        CalculatorController calculatorController = new CalculatorController(inputView);
        calculatorController.run();
    }
}
