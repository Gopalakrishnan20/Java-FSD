package pkg6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class RepeatedTest {

    @Test
    @DisplayName("Add operation test")
    @RepeatedTest(5)
    void addNumber() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
        System.out.println("===addNumber testcase executed===");
    }

}
