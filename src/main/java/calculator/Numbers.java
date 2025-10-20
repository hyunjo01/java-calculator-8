package calculator;

import java.util.ArrayList;

public class Numbers {

    private ArrayList<Long> values;

    public Numbers() {
        values = new ArrayList<>();
    }

    public void addOperand(Long value) {
        values.add(value);
    }

}
