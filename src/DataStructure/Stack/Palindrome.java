package DataStructure.Stack;

/*
You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints

Note
String S consists of lowercase English Alphabets only.

SAMPLE INPUT
aba
SAMPLE OUTPUT
YES
 */

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine().trim(); //getting input string
        char[] char_1 = str.toCharArray(); // converting string into char array
        //stack class
        Stack<Character> stack = new Stack<>();

        for (char c : char_1) {
            stack.push(c);  // Pushing char to stack
        }

        char[] char_2 = new char[char_1.length];  // initializing new char array for comparision

        for (int i = 0; i < char_1.length; i++) {
            char_2[i] = stack.pop();  // pop element from stack and store in 2nd char array
        }

        String res_str = new String(char_2); // converting char array to string

        // comparing and printing the result
        if (res_str.equals(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

