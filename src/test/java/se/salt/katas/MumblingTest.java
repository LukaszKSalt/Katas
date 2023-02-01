package se.salt.katas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MumblingTest {

    Mumbling mumbling = new Mumbling();

    @Test
    void shouldRun() {
        assertEquals(1, 1);
    }

    @Test
    void shouldReturnFirstLetterAsCapital() {
        assertEquals("A", mumbling.mumble("a"));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "A, a",
            "A-Bb, ab",
            "A-Bb-Ccc, abc",
            "A-Bb-Ccc-Dddd, abcd",
            "G-Hh-Eee-Oooo-Lllll, gheol",
            "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy, RqaEzty",
            "C-Ww-Aaa-Tttt, cwAt",
            "'',''",
            "$-##----, $#-"

    })
    void shouldReturnMumble(String expected, String toTest) {
        assertEquals(expected, mumbling.mumble(toTest));
    }
}