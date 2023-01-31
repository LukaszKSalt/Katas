package se.salt.katas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MexicanWaveTest {

    @Test
    void shouldRun() {
        assertEquals(1,1);
    }

    @Test
    void shouldReturnStringInCapitalLetter(){
        assertEquals(List.of("M"), MexicanWave.makeMexicanWave("m"));
    }

    @Test
    void shouldReturnAListWithReplacedLetters(){
        assertEquals(List.of("Me","mE"), MexicanWave.makeMexicanWave("me"));
    }

    @ParameterizedTest
    @MethodSource("provideValues")
    void shouldReturnAMexicanWaveFromAStringAsAList(String input, List<String> expected){
        assertEquals(expected, MexicanWave.makeMexicanWave(input));
    }

    private static Stream<Arguments> provideValues() {
        return Stream.of(
                Arguments.of("null", List.of("Null", "nUll", "nuLl", "nulL")),
                Arguments.of("hello", List.of("Hello", "hEllo", "heLlo", "helLo", "hellO")),
                Arguments.of("hee wo", List.of("Hee wo", "hEe wo", "heE wo", "hee wo", "hee Wo", "hee wO")),
                Arguments.of("helllo", List.of("Helllo", "hElllo", "heLllo", "helLlo", "hellLo", "helllO")),
                Arguments.of("he-#4", List.of("He-#4", "hE-#4", "he-#4", "he-#4", "he-#4")),
                Arguments.of("", List.of())
        );
    }

}