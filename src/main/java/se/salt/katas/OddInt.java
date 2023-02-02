package se.salt.katas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 * <p>
 * Examples
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 * <a href="https://www.codewars.com/kata/54da5a58ea159efa38000836">CodeWars Link</a>
 */
public class OddInt {

    public int returnOdd(int[] ints) {
        Map<Integer, Integer> toReturn = new HashMap<>();
        Arrays.stream(ints)
                .forEach(it ->{
                    if (toReturn.containsKey(it)){
                        toReturn.put(it, toReturn.get(it) + 1);
                    } else {
                        toReturn.put(it,1);
                    }
                });
        return toReturn.entrySet()
                .stream()
                .filter(key -> key.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
