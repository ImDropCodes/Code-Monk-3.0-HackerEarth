package DataStructure.Array;
/*
Given the size and the elements of array A, print all the elements in reverse order.

Input:
First line of input contains, N - size of the array.
Following N lines, each contains one integer, i{th} element of the array i.e. A[i].

Output:
Print all the elements of the array in reverse order, each element in a new line.

Constraints:

SAMPLE INPUT
5 -> array size

array element
4
12
7
15
9
SAMPLE OUTPUT
9
15
7
12
4
 */

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int size = s.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }


        for (int j = size - 1; j >= 0; j--) {
            System.out.println(array[j]);
        }
    }
}
