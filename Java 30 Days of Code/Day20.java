import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numSwaps = 0;
        for(int i = 0; i < n; i++) {
            int numberofSwaps = 0;
            
            for(int j = 0; j < n-1; j++) {
                if(a[j] > a[j+1]) {
                    swap(a, j, j+1);
                    numberofSwaps++;
                    numSwaps++;
                    
                }
                
            }
            if(numberofSwaps == 0) {
                break;
            }
        }
        
        int firstElement = a[0];
        int lastElement = a[a.length-1];
        System.out.println("Array is sorted in "+numSwaps+" swaps.");
        System.out.println("First Element: "+firstElement);
        System.out.println("Last Element: "+lastElement);
        
        
    }
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        
        int firstValue = array[firstIndex];
        int secondValue = array[secondIndex];
        array[firstIndex] = secondValue;
        array[secondIndex] = firstValue;
        
        
        
    }
    
}

