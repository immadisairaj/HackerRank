import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        while(n-- > 0) {
            String name = scanner.nextLine();
            for(int i=0; i<name.length(); i++) {
                if(i%2 == 0)
                    System.out.print(name.charAt(i));
            }
            System.out.print(" ");
            for(int i=0; i<name.length(); i++) {
                if(i%2 != 0)
                    System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }
}