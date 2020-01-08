package DataStructure.Stack;
/*
Monk introduces the concept of palindrome saying,"A palindrome is a sequence of characters which reads the same backward or forward."
Now, since he loves things to be binary, he asks you to find whether the given string is palindrome or not. If a given string is palindrome, you need to state that it is even palindrome (palindrome with even length) or odd palindrome (palindrome with odd length).

Input:
The first line consists of T, denoting the number of test cases.
Next follow T lines, each line consisting of a string of lowercase English alphabets.

Output:
For each string , you need to find whether it is palindrome or not.
If it is not a palindrome, print NO.
If it is a palindrome, print YES followed by a space; then print EVEN it is an even palindrome else print ODD.
Output for each string should be in a separate line.
See the sample output for clarification.

SAMPLE INPUT
3
abc
abba
aba
SAMPLE OUTPUT
NO
YES EVEN
YES ODD
 */

import java.util.Scanner;

public class Monk_Teaches_Palindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int test_case = s.nextInt();

        String[] str_arr = new String[test_case];

        for (int i = 0; i < test_case; i++) {
            str_arr[i] = s.next();
        }
        for (String str : str_arr) {
            String res = Palindrome(str);
            System.out.println(res);
        }
    }

    public static String Palindrome(String str) {

        Stack_char stack = new Stack_char(str.length());

        char[] char_str = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            char_str[i] = stack.pop();
        }
        // converting chr to str
        String res_str = new String(char_str);

        // eve_odd function call
        String ev_od = eve_odd(str.length());

        if (res_str.equals(str)) {
            return "YES " + ev_od;
        }

        return "NO";
    }

    // check if string length is even or odd
    public static String eve_odd(int x) {
        if (x % 2 == 0) {
            return "EVEN";
        }
        return "ODD";
    }
}

