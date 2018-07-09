import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int count = 0, max = 0;
        while(n > 0) {
            if(n%2 > 0) {
                count++;
            } else {
                if(count > max)
                    max = count;
                count = 0;
            }
            n /= 2;
            if(n <= 0 && max < count)
                max = count;
        }
        
        System.out.println(max);

        scanner.close();
    }
}
