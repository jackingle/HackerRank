import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
	
	//Initiating a variable called stack which is a stack to use later
	Stack<Character> stack = new Stack<Character>();
	//Initiating a variable called queue which is a queue to use later, using LinkedList as an implementation of the Queue interface
	Queue<Character> queue = new LinkedList<Character>();
	
	
	//Adds a character onto the top of the stack
	void pushCharacter(char ch) {
		stack.push(ch);
		
		
	}
	//Adds a character to the end of the queue
	void enqueueCharacter(char ch) {
		queue.add(ch);
		
		
	}
	//Removes and returns the character at the top of the stack
	char popCharacter() {
		return stack.pop();
		
	}
	//Removes and returns the first character in the queue
	char dequeueCharacter() {
		return queue.remove();
		
	}
	
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}