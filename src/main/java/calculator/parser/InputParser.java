package calculator.parser;

import calculator.ExpressionInput;

public class InputParser {

    private final CustomDelimiterParser customDelimiterParser;

    public InputParser() {
        customDelimiterParser = new CustomDelimiterParser();
    }

    public void parseToNumbers(String inputString) {

        ExpressionInput expressionInput = customDelimiterParser.parseToExpressionInput(inputString);

    }

}
