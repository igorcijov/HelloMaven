package homework16.updated;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestCheckArrayForNumbersTask2 {
    CheckArrayForNumbersTask2 hw;

    @BeforeEach
    public void init() {
        hw = new CheckArrayForNumbersTask2();
    }

    static int numberOne = 1;
    static int numberTwo = 4;

    public static Stream<Arguments> dataForTestCheckArrayForNumbers() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 1, 1, 4, 4, 1, 4, 4}, numberOne, numberTwo, true));
        out.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1}, numberOne, numberTwo, false));
        out.add(Arguments.arguments(new int[]{4, 4, 4, 4}, numberOne, numberTwo, false));
        out.add(Arguments.arguments(new int[]{1, 1, 1, 4, 3, 1, 4, 4}, numberOne, numberTwo, false));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForTestCheckArrayForNumbers")
    public void testCheckArrayForNumbers(int[]array, int numberOne, int numberTwo, boolean result){
        Assertions.assertEquals(hw.checkArrayForNumbersClassic(array,numberOne,numberTwo), result);
    }
}

