package DataStructure.Array_String;

/*
Tony Stark is in the planet Titan crying for his friends are turning into ashes, and on earth mayhem has ensued since a lot of people are turning into ashes too. Some trains have been derailed in such a way that a lot of its coaches are thrown off in a random disarray like coach 3, 4 and 5 are thrown off in one place, coach 2 and 6 are thrown off in another place, etc.

S.H.I.E.L.D calls upon Hulk and jarvis to help them collect and connect some the thrown off coaches of those trains, but a train can only move if the collected coaches number are in a continuous manner (need not to be in order) ,like 1234, 2314, 4123, 2341  etc.

Help Jarvis write a program for hulk to decide whether collected coaches will move or not.

Input Format:

First ilne contains one number t , denoting the number of test cases.

Next t lines contain sequence of the collected coach numbers (n)

Output Format:

YES or NO (In capitals)

Input constraints:

1 <= t <= 10000

1<= n <= 1000000

SAMPLE INPUT
6

2415
4231
4125
5142
4132
2143

SAMPLE OUTPUT
NO
YES
NO
NO
YES
YES

Explanation
4231
4132
2143

For the above sample inputs the train will move because the combination of the coach numbers are in a continuous sequence.
 */

import java.util.Scanner;

public class Help_Jarvis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int test_case = s.nextInt();

        int[] array = new int[test_case];

        for (int i = 0; i < test_case; i++) {
            array[i] = s.nextInt();
        }

        int count = 0;
        for (int x : array) {
            while (x > 0) {
                int rem = x % 10;
                x = x / 10;
                if (rem == 1 || rem == 2 || rem == 3 || rem == 4) {
                    count++;
                }
            }
            if (count == 4) {
                System.out.println("YES");
                count = 0;
            } else {
                System.out.println("NO");
                count = 0;
            }
        }
    }
}
