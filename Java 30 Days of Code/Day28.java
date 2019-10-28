import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String fullEmailList = "";
        //
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            if (emailID.contains("@gmail.com")) {
                fullEmailList += firstName +":";
            }
        }

        scanner.close();
        String[] firstNameArray = fullEmailList.split(":");
        List<String> firstNameList= new ArrayList<String>();
        for(String name : firstNameArray) {
            firstNameList.add(name);
        }
        Collections.sort(firstNameList);
        for(String name : firstNameList) {
            System.out.println(name);
        }
        
        
    }
}
