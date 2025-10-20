package calculator.parser;

import calculator.ExpressionInput;
import calculator.Operands;

public class InputParser {

    private final CustomDelimiterParser customDelimiterParser;
    private final ExpressionTokenizer expressionTokenizer;


    public InputParser() {
        customDelimiterParser = new CustomDelimiterParser();
        expressionTokenizer = new ExpressionTokenizer();
    }

    public Operands parseToOperands(String inputString) {
        ExpressionInput expressionInput = customDelimiterParser.parseToExpressionInput(inputString);
        String[] tokens = expressionTokenizer.tokenize(expressionInput);
        Operands operands = new Operands(tokens);
        return operands;
    }

}
