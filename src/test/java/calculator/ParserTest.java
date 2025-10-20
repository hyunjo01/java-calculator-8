package calculator;

import calculator.parser.CustomDelimiterParser;
import calculator.parser.ExpressionTokenizer;
import calculator.parser.InputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParserTest {

    InputParser inputParser = new InputParser();
    CustomDelimiterParser customDelimiterParser = new CustomDelimiterParser();
    ExpressionTokenizer expressionTokenizer = new ExpressionTokenizer();

    @ParameterizedTest
    @ValueSource(strings = {";", ";?", "", "3"})
    void 커스텀_구분자_파싱(String customDelimiter) {
        String expression = "1;2;3";
        String inputString = "//" + customDelimiter + "\\n" + expression;
        ExpressionInput expressionInput = customDelimiterParser.parseToExpressionInput(inputString);
        Assertions.assertEquals(expressionInput.getExpression(), expression.toString());
    }

    Delimiters delimiters = new Delimiters();
    @Test
    void 구분자_비어있음() {

        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () ->
                delimiters.addDelimiter(""));
        Assertions.assertEquals(e.getMessage(), "커스텀 구분자는 한글자로 입력하세요.");
    }

    @Test
    void 구분자_두글자_이상() {

        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () ->
                delimiters.addDelimiter("aa"));
        Assertions.assertEquals(e.getMessage(), "커스텀 구분자는 한글자로 입력하세요.");
    }

    @Test
    void 커스텀_구분자_기본_구분자와_중복() {

        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () ->
                delimiters.addDelimiter(":"));
        Assertions.assertEquals(e.getMessage(), "입력하신 커스텀 구분자가 기본 구분자와 중복입니다.");
    }

    @Test
    void 커스텀_구분자_숫자() {

        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () ->
                delimiters.addDelimiter("3"));
        Assertions.assertEquals(e.getMessage(), "숫자는 구분자로 사용이 불가합니다.");
    }

}
