package Algorithm.Searching.Linear;
/*
You have been given an array of size N consisting of integers. In addition you have been given an element M you need to find and print the index of the last occurrence of this element M in the array if it exists in it, otherwise print -1. Consider this array to be 1 indexed.

Input Format:
The first line consists of 2 integers N and M denoting the size of the array and the element to be searched for in the array respectively . The next line contains N space separated integers denoting the elements of of the array.

Output Format:
Print a single integer denoting the index of the last occurrence of integer M in the array if it exists, otherwise print -1.

SAMPLE INPUT
5 1
1 2 3 4 1

SAMPLE OUTPUT
5
 */

import java.util.Scanner;

public class Last_Occurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int element = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int res = LinearSearch(array, element);
        System.out.println(res);
    }

    public static int LinearSearch(int[] array, int element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element) {
                return i + 1;
            }
        }

        return -1;

    }
}
