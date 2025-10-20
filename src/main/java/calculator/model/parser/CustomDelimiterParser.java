package calculator.parser;

import calculator.Delimiters;
import calculator.ExpressionInput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomDelimiterParser {

    private static final String CUSTOM_DELIMITER_PARSING_REGEX = "^//(.*)\\\\n(.*)";

    public CustomDelimiterParser() {

    }

    public ExpressionInput parseToExpressionInput(String inputString) {

        Pattern customDelimiterParsingPattern = Pattern.compile(CUSTOM_DELIMITER_PARSING_REGEX);
        Matcher customDelimiterParsingMatcher = customDelimiterParsingPattern.matcher(inputString);

        Delimiters delimiters = new Delimiters();
        String expression = inputString;

        if (customDelimiterParsingMatcher.find()) {
            String customDelimiter = customDelimiterParsingMatcher.group(1);
            delimiters.addDelimiter(customDelimiter);

            expression = customDelimiterParsingMatcher.group(2);
        }

        return new ExpressionInput(delimiters, expression);
    }

}
