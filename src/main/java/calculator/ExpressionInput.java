package calculator;

public class ExpressionInput {

    private final Delimiters delimiters;
    private final String expression;

    public ExpressionInput(Delimiters delimiters, String expression) {
        this.delimiters = delimiters;
        this.expression = expression;
    }

    public Delimiters getDelimiters() {
        return delimiters;
    }

    public String getExpression() {
        return expression;
    }
}
