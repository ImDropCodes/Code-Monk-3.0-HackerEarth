package BasicsIO;

/*
You have been given a positive integer N. You need to find and print the Factorial of this number. The Factorial of a positive integer N refers to the product of all number in the range from 1 to N. You can read more about the factorial of a number here.

Input Format:
The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.

Output Format
Output a single line denoting the factorial of the number N.

Constraints

SAMPLE INPUT
2
SAMPLE OUTPUT
2
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int fac = Rec(num);
        System.out.println(fac);

    }

    // using recursion function for factorial
    public static int Rec(int num) {
        if (num == 1) {
            return 1;
        }
        return Rec(num - 1) * num;
    }
}
