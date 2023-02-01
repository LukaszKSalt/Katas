package se.salt.katas;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Task
 * In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
 * You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
 * <p>
 * Rules
 *  1.  The input string will always be lower case but maybe empty.
 * <p>
 *  2.  If the character in the string is whitespace then pass over it as if it was an empty seat
 * <p>
 * Example
 * wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]
 * <p>
 * <a href="https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/java">CodeWars Link</a>
 */

public class MexicanWave {
    public static List<String> makeMexicanWave(String m) {
        if (m == null) {
            throw new IllegalArgumentException("String has to be provided");
        }
        return IntStream.range(0,m.length())
                .mapToObj(it -> {
                    StringBuilder builder = new StringBuilder(m);
                    builder.setCharAt(it, Character.toUpperCase(m.charAt(it)));
                    return builder.toString();
                }).toList();
    }
}