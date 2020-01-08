package DataStructure.Array_String;
/*
Given a 2D array A, your task is to convert all rows to columns and columns to rows.

Input:
First line contains 2 space separated integers, N - total rows, M - total columns.
Each of the next N lines will contain M space separated integers.

Output:
Print M lines each containing N space separated integers.

SAMPLE INPUT
3 5
13 4 8 14 1
9 6 3 7 21
5 12 17 9 3
SAMPLE OUTPUT
13 9 5
4 6 12
8 3 17
14 7 9
1 21 3
 */

import java.util.Scanner;

public class Array_Row_to_Column {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int row = s.nextInt();
        int column = s.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = s.nextInt();
            }
        }


        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}

