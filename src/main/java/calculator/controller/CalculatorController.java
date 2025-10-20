package calculator.controller;

import calculator.Numbers;
import calculator.parser.InputParser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    private final InputView inputView;
    private final OutputView outputView;
    private final InputParser inputParser;

    public CalculatorController(InputView inputView, OutputView outputView, InputParser inputParser) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.inputParser = inputParser;
    }

    public void run() {
        String inputString = inputView.view();
        Numbers numbers = inputParser.parseToOperands(inputString);
        Long result = numbers.calculateSum();
        outputView.view(result.toString());
    }

}
