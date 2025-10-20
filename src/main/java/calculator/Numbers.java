package calculator;

import java.util.ArrayList;

public class Numbers {

    private ArrayList<Long> values;
    private static final String CALCULATION_OVERFLOW_ERROR_MESSAGE = "계산 값이 너무 큽니다.";

    public Numbers() {
        values = new ArrayList<>();
    }

    public void addNumber(Long value) {
        values.add(value);
    }

    public Long calculateSum() {
        Long result = 0L;
        for (Long value: values) {
            try {
                result =  Math.addExact(result, value);
            } catch (Exception e) {
                throw new IllegalArgumentException(CALCULATION_OVERFLOW_ERROR_MESSAGE);
            }
        }
        return result;
    }

}
