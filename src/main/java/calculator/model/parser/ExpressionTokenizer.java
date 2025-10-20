package calculator.parser;

import calculator.ExpressionInput;

public class ExpressionTokenizer {

    private static final String TOKENIZER_REGEX_OPEN = "[";
    private static final String TOKENIZER_REGEX_CLOSE = "]";

    public ExpressionTokenizer() {
    }

    public String[] tokenize(ExpressionInput expressionInput) {
        String expression = expressionInput.getExpression();
        String splitRegex = toTokenizerRegex(expressionInput);

        return expression.split(splitRegex);
    }

    private String toTokenizerRegex(ExpressionInput expressionInput) {
        return TOKENIZER_REGEX_OPEN + expressionInput.getDelimitersString() + TOKENIZER_REGEX_CLOSE;
    }

}
