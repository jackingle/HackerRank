package com.Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day9 {

    // Complete the factorial function below.
    static int factorial(int n) {

    	if (n <= 1) {
    		return 1;
    		
    	}else {
    		return n * factorial(n-1);
    		//find return value of cheese2(3)
    		//returns 4 * 6
    	}

    }
    static int cheese2(int n) {

    	if (n <= 1) {
    		return 1;
    		
    	}else {
    		return n * cheese3(n-1);
    		//find return value of cheese3(2)
    		//returns 3 * 2
    	}

    }
    static int cheese3(int n) {

    	if (n <= 1) {
    		return 1;
    		
    	}else {
    		return n * cheese4(n-1);
    		//find return value of cheese4(1)
    		//returns 2 * 1
    	}

    }static int cheese4(int n) {

    	if (n <= 1) {
    		return 1;
    		//return value of cheese4
    	}else {
    		return n * cheese4(n-1);
    	
    	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
