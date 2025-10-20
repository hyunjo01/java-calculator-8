package calculator.parser;

import calculator.ExpressionInput;
import calculator.Numbers;

public class InputParser {

    private final CustomDelimiterParser customDelimiterParser;
    private final ExpressionTokenizer expressionTokenizer;
    private final NumbersConverter numbersConverter;


    public InputParser() {
        customDelimiterParser = new CustomDelimiterParser();
        expressionTokenizer = new ExpressionTokenizer();
        numbersConverter = new NumbersConverter();
    }

    public Numbers parseToOperands(String inputString) {
        ExpressionInput expressionInput = customDelimiterParser.parseToExpressionInput(inputString);
        String[] tokens = expressionTokenizer.tokenize(expressionInput);
        return numbersConverter.convertToNumbers(tokens);
    }

}
