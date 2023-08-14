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
     * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero
     * Print the decimal value of each fraction on a new line with  places after the decimal.
     */

    public static void plusMinus(List<Integer> arr) {
    
    double pos=0;
    double neg=0;
    double zero=0;
    
    for (int i = 0; i < arr.size(); i++) {
        
        if (arr.get(i)>0) {
            pos++;
        } else if (arr.get(i)<0) {
            neg++;
            
        } else {
            zero++;
            
        }
        
    }
        
    
            System.out.println(pos/arr.size());
            System.out.println(neg/arr.size());
            System.out.println(zero/arr.size());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
