package calculator;

import java.util.ArrayList;

public class Delimiters {

    private static final String defaultDelimiter1 = ",";
    private static final String defaultDelimiter2 = ":";
    private static final int DELIMITER_LENGTH = 1;
    private static final String NUMBER_REGEX = "\\d+";

    private static final String CUSTOM_DELIMITER_LENGTH_ERROR_MESSAGE = "커스텀 구분자는 한글자로 입력하세요.";
    private static final String CUSTOM_DELIMITER_DUPLICATION_ERROR_MESSAGE = "입력하신 커스텀 구분자가 기본 구분자와 중복입니다.";
    private static final String CUSTOM_DELIMITER_NUMBER_ERROR_MESSAGE = "숫자는 구분자로 사용이 불가합니다.";


    private ArrayList<String> values;

    public Delimiters() {
        values = new ArrayList<>();
        values.add(defaultDelimiter1);
        values.add(defaultDelimiter2);
    }

    public void addDelimiter(String delimiter) {
        validateDelimiter(delimiter);
        values.add(delimiter);
    }

    private void validateDelimiter(String delimiter) {
        if (delimiter.length() != DELIMITER_LENGTH) throw new IllegalArgumentException(CUSTOM_DELIMITER_LENGTH_ERROR_MESSAGE);
        if (values.contains(delimiter)) throw new IllegalArgumentException(CUSTOM_DELIMITER_DUPLICATION_ERROR_MESSAGE);
        if (delimiter.matches(NUMBER_REGEX)) throw new IllegalArgumentException(CUSTOM_DELIMITER_NUMBER_ERROR_MESSAGE);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String delimiter: values) sb.append(delimiter);
        return sb.toString();
    }
}
