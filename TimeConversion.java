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
     * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
     * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
     * 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     */

    public static String timeConversion(String s) {
        int convertedHour;
        String temp=s.substring(0, 2);
        if(s.contains("PM") && !temp.equals("12")){
            convertedHour = (Integer.parseInt(temp)+12)%24;
            temp=String.valueOf(convertedHour); 
            return temp+s.substring(2,8);
        }
        else if(s.contains("AM") && temp.equals("12")) {
            temp="00";
            return temp+s.substring(2,8);
        }
        return s.substring(0,8);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
