package calculator;

public class Operands {

    private String[] values;
    private static final String OPERAND_EMPYT_REGEX = "";
    private static final String OPERAND_NUMBER_REGEX = "\\d+";
    private static final String OPERAND_NOT_NUMBER_ERROR_MESSAGE = "피연산자에 숫자가 아닌 값이 포함되었습니다.";

    public Operands(String[] values) {
        validate(values);
        this.values = values;
    }

    private void validate(String[] values) {
        for (String value: values) {
            if (value.matches(OPERAND_EMPYT_REGEX)) return;
            if (value.matches(OPERAND_NUMBER_REGEX)) return;
            throw new IllegalArgumentException(OPERAND_NOT_NUMBER_ERROR_MESSAGE);
        }
    }

}
