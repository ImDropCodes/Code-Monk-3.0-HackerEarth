package Algorithm.Searching.Binary;
/*
You have been given an array A consisting of N integers. All the elements in this array A are unique. You have to answer some queries based on the elements of this array. Each query will consist of a single integer x. You need to print the rank based position of this element in this array considering that the array is 1 indexed. The rank based position of an element in an array is its position in the array when the array has been sorted in ascending order.

Note: It is guaranteed that all the elements in this array are unique and for each x belonging to a query, value x shall exist in the array

Input Format:
The first line consists of a single integer N denoting the size of array A. The next line contains N unique integers, denoting the content of array A. The next line contains a single integer q denoting the number of queries. Each of the next q lines contains a single integer x denoting the element whose rank based position needs to be printed.

Output Format:
You need to print q integers denoting the answer to each query.

SAMPLE INPUT
5
1 2 3 4 5
5
1
2
3
4
5
SAMPLE OUTPUT
1
2
3
4
5
 */

import java.util.Arrays;
import java.util.Scanner;

public class Rank_it {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = s.nextInt();
        }
        Arrays.sort(array);
        int q = s.nextInt();
        int[] res_array = new int[q];
        for (int i = 0; i < q; i++) {
            int ele = s.nextInt();
            int ans = BinarySearch(ele, 0, N - 1, array);
            res_array[i] = ans;
        }

        for (int x : res_array) {
            System.out.println(x + 1);
        }
    }

    public static int BinarySearch(int ele, int left, int right, int[] array) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == ele) {
                return mid;
            } else if (array[mid] > ele) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
