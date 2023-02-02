package se.salt.katas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OddIntTest {

    OddInt oddInt = new OddInt();

    @Test
    void shouldRun() {
        assertEquals(1,1);
    }

    @Test
    void shouldAcceptArrayAndReturnTheNumber() {
        assertEquals(1, oddInt.returnOdd(new int[]{1}));
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void shouldReturnOddOccurancesInt(int expected, int[] check) {
        assertEquals(expected, oddInt.returnOdd(check));
    }

    public static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(4,new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}),
                Arguments.of(0,new int[]{0,1,0,1,0}));
    }

}