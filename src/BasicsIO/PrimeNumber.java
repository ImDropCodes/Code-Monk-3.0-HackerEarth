package BasicsIO;

/*
You are given an integer N. You need to print the series of all prime numbers till N.

Input Format

The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

Output Format

Print the desired output in single line separated by spaces.

Constraints

1<=N<=1000

SAMPLE INPUT
9
SAMPLE OUTPUT
2 3 5 7
 */

import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num != 1) {
            for (int i = 2; i < num; i++) {
                boolean flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                    }
                }
                if (flag == true) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
