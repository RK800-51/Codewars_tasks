// Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
//
//Examples:
//Input: 42145 Output: 54421
//
//Input: 145263 Output: 654321
//
//Input: 123456789 Output: 987654321

import java.util.*;
public class DescendingOrder_7kyu {
    public static int sortDesc(final int num) {
        String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
        Arrays.sort(numbers);

        String result = "";

        for(String s : numbers)
        {
            result = s + result;
        }

        return Integer.parseInt(result);
    }
}
