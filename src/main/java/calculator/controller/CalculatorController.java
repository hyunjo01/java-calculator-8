package calculator.controller;

import calculator.parser.InputParser;
import calculator.view.InputView;

public class CalculatorController {

    private final InputView inputView;
    private final InputParser inputParser;

    public CalculatorController(InputView inputView, InputParser inputParser) {
        this.inputView = inputView;
        this.inputParser = inputParser;
    }

    public void run() {
        String inputString = inputView.view();
        inputParser.parseToOperands(inputString);
    }

}
