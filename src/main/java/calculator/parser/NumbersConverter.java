package calculator.parser;

import calculator.Numbers;

public class NumbersConverter {

    private static final String OPERAND_EMPYT_REGEX = "";
    private static final String OPERAND_NUMBER_REGEX = "\\d+";
    private static final String OPERAND_NOT_NUMBER_ERROR_MESSAGE = "피연산자에 숫자가 아닌 값이 포함되었습니다.";
    private static final String OPERAND_OUT_OF_RANGE_ERROR_MESSAGE = "피연산자의 수가 너무 큽니다.";

    public Numbers convertToNumbers(String[] tokens) {
        Numbers numbers = new Numbers();
        for (String token: tokens) {
            if (token.matches(OPERAND_EMPYT_REGEX)) continue;
            numbers.addOperand(covert(token));
        }
        return numbers;
    }

    private Long covert(String token) {
        validate(token);
        try {
            return Long.parseLong(token);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(OPERAND_OUT_OF_RANGE_ERROR_MESSAGE);
        }
    }

    private void validate(String token) {
        if (token.matches(OPERAND_NUMBER_REGEX)) return;
        throw new IllegalArgumentException(OPERAND_NOT_NUMBER_ERROR_MESSAGE);
    }
}
