package com.Hackerrank;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	//  123abc
    	//  122def
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int T = scanner.nextInt();
    	scanner.nextLine();
    	
    	// 2/n
    	// Hacker/n
    	// Rank/n
    	
    	
    	for (int i=0; i < T; i++) {
    		String S = scanner.nextLine();
    		String oddS = "";
    		String evenS = "";
    		
    		for(int j=0; j < S.length(); j++) {
    			char currentChar = S.charAt(j);
    			if(j % 2 == 0) {
    			 	evenS = evenS + currentChar;
    				
    				
    				
    				
    			}else {
    				oddS = oddS + currentChar;
    				
    				
    			}
    				
    			
    			
    				
    		}
    		System.out.println(evenS + " " + oddS);
    	
    	
    	
    	
    	
    	
    	
    	}

	
	}
}

