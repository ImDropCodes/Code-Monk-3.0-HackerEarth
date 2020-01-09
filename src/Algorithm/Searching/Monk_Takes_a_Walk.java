package Algorithm.Searching;
/*
Today, Monk went for a walk in a garden. There are many trees in the garden and each tree has an English alphabet on it. While Monk was walking, he noticed that all trees with vowels on it are not in good state. He decided to take care of them. So, he asked you to tell him the count of such trees in the garden.
Note : The following letters are vowels: 'A', 'E', 'I', 'O', 'U' ,'a','e','i','o' and 'u'.

Input:
The first line consists of an integer T denoting the number of test cases.
Each test case consists of only one string, each character of string denoting the alphabet (may be lowercase or uppercase) on a tree in the garden.

Output:
For each test case, print the count in a new line.

SAMPLE INPUT

2
nBBZLaosnm
JHkIsnZtTL

SAMPLE OUTPUT
2
1
Explanation
In test case 1, a and o are the only vowels. So, count=2
 */

import java.util.Scanner;

public class Monk_Takes_a_Walk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt();
        for (int i = 0; i < test_case; i++) {
            String str = s.next().toLowerCase();
            int count = search(str.toCharArray());
            System.out.println(count);
        }
    }

    public static int search(char[] chr) {
        int count = 0;
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}
