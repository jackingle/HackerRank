import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        
        
        int runningSum = 0;
        
        
        for(int i = 1;i<=n; i++) {
        	
        	if(isNumberDivisor(i, n)) {
        		runningSum = runningSum + i;
        	}
        	
        	
        	
        	
        }
        return runningSum;
    }
    
    boolean isNumberDivisor(int d, int n) {
    	if(n % d == 0) {
    		return true;
    		
    	} else {
    		return false;
    		
    	}
    	
    	
    }
    
    
}


class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}