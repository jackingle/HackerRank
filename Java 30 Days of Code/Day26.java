import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int fine = 0;
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        if (y < y2) {
            fine = 0;
        }
        
        
        else if (y == y2){
            if(m < m2) {
                fine = 0;
            }
            
            else if(m == m2) {
                if( d <= d2) {
                    fine = 0;
                }
                else if(d > d2) {
                    fine = 15 * (d-d2);
                }
            }
            else if(m > m2) {
                fine = 500 * (m-m2);
            }
        }
        
        
        else if(y > y2) {
            fine = 10000;
        }
        System.out.println(fine);
        
        
        
    }
}

