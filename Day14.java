import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
	public Difference(int[] a) {
		
		for(int i=0; i < 101; i++) {
			
		}
		
		
		// TODO Auto-generated constructor stub
	}
	public void computeDifference() {
		
		maximumDifference = max - min;
		
		// TODO Auto-generated method stub
		
	}

	// Add your code here
  	
  	
  	
  	
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}