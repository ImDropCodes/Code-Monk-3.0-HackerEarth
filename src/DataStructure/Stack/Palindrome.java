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

        String str = s.nextLine().trim();

        char[] char_1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char_1[i] = str.charAt(i);
        }
        Stack stack = new Stack(char_1.length);

        for (char c : char_1) {
            stack.push(c);
        }
        char[] char_2 = new char[char_1.length];

        for (int i = 0; i < char_1.length; i++) {
            char_2[i] = stack.pop();
        }

        String res_str = new String(char_2);
        if (res_str.equals(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

