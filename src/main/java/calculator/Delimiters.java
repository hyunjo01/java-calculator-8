package calculator;

import java.util.ArrayList;

public class Delimiters {

    private static final String defaultDelimiter1 = ",";
    private static final String defaultDelimiter2 = ":";
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

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String delimiter: values) sb.append(delimiter);
        return sb.toString();
    }
}
