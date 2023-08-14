import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    /* 
     * Given five positive integers, find the minimum and maximum values that can be calculated 
     * by summing exactly four of the five integers. Then print the respective 
     * minimum and maximum values as a single line of two space-separated long integers. 
     * */

   

    public static void miniMaxSum(List<Integer> arr) {
         long sum = 0;
    long min_val = Long.MAX_VALUE;
    long max_val = Long.MIN_VALUE;
    
    for (int i = 0; i < arr.size(); i++) {
        long currentValue = arr.get(i);
        sum += currentValue;
        
        if (currentValue < min_val) {
            min_val = currentValue;
        }
        
        if (currentValue > max_val) {
            max_val = currentValue;
        }
    }
        System.out.print((sum - max_val) + " "+(sum - min_val));
     

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
