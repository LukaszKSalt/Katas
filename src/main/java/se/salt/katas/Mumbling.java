package se.salt.katas;

import java.util.stream.IntStream;

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * <p>
 * Examples:
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 * <p>
 * <a href="https://www.codewars.com/kata/5667e8f4e3f572a8f2000039">CodeWars Link</a>
 */
public class Mumbling {
    public String mumble(String mumble) {
        if (mumble == null) {
            throw new IllegalArgumentException("Mumble has to be provided");
        }
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, mumble.length())
                .forEach(it -> {
                    builder.append(mumble.substring(it, it + 1).toUpperCase());
                    builder.append(mumble.substring(it, it + 1).toLowerCase().repeat(it));
                    if (it != mumble.length() - 1) {
                        builder.append("-");
                    }
                });
        return builder.toString();
    }
}
