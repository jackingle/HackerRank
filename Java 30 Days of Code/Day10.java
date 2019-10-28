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

        
        
        scanner.close();
        
        String output = "";
        int remainder;
        do { 
            remainder = n % 2;
            n = n/2;
            output = remainder + output;
            
            
            
        }while(n > 0);
        
       String[] onesArray = output.split("0");
       int maxNumberOfOnes = 0;
       
        for (int i=0; i < onesArray.length; i++) {
            String currentOnes = onesArray[i];
            int currentOnesLength = currentOnes.length();
            if(currentOnesLength > maxNumberOfOnes) { 
                
                maxNumberOfOnes = currentOnesLength;
            }
            
            
            
            
            
        }
       System.out.println(maxNumberOfOnes); 
    }
}
