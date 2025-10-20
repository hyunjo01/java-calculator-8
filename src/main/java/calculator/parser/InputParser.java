package calculator.parser;

import calculator.ExpressionInput;

public class InputParser {

    private final CustomDelimiterParser customDelimiterParser;
    private final ExpressionTokenizer expressionTokenizer;


    public InputParser() {
        customDelimiterParser = new CustomDelimiterParser();
        expressionTokenizer = new ExpressionTokenizer();
    }

    public void parseToNumbers(String inputString) {

        ExpressionInput expressionInput = customDelimiterParser.parseToExpressionInput(inputString);
        String[] tokens = expressionTokenizer.tokenize(expressionInput);

    }

}
