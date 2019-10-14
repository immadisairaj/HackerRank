import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
    
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numberOfSwaps++;
                    count++;
                }
            }
    
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element is "+a[0]);
        System.out.println("Last Element is "+a[n-1]);
    }
}
