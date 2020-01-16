package DataStructure.Stack;

/*
Monk loves to preform different operations on arrays, and so being the principal of HackerEarth School, he assigned a task to his new student Mishki. Mishki will be provided with an integer array A of size N and an integer K , where she needs to rotate the array in the right direction by K steps and then print the resultant array. As she is new to the school, please help her to complete the task.

Input:
The first line will consists of one integer T denoting the number of test cases.
For each test case:
1) The first line consists of two integers N and K, N being the number of elements in the array and K denotes the number of steps of rotation.
2) The next line consists of N space separated integers , denoting the elements of the array A.
Output:
Print the required array.

SAMPLE INPUT
1
5 2
1 2 3 4 5
SAMPLE OUTPUT
4 5 1 2 3
Explanation
Here T is 1, which means one test case.
N=5 denoting the number of elements in the array and K = 2, denoting the number of steps of rotations.
The initial array is: 1,2,3,4,5
In first rotation, 5 will come in the first position and all other elements will move to one position ahead from their current position. Now, the resultant array will be 5,1,2,3,4
In second rotation, 4 will come in the first position and all other elements will move to one position ahead from their current position. Now, the resultant array will be 4,5,1,2,3
 */

import java.util.Scanner;

public class Monk_and_Rotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt();
        for (int i = 0; i < test_case; i++) {

            int num_ele = s.nextInt();
            int step = s.nextInt();
            int[] array = new int[num_ele];

            Stack<Integer> stack = new Stack<>();

            for (int j = 0; j < num_ele; j++) {
                stack.push(s.nextInt());
            }
            for (int k = step-1; k >= 0; k--) {
                array[k] = stack.pop();
            }
            for (int l = num_ele - 1; l >= step; l--) {
                array[l] = stack.pop();
            }
            for (int x : array){
                System.out.print(x+" ");
            }
        }
    }
}
