package DataStructure.Array_String;
/*
Given a string S, and two numbers N, M - arrange the characters of string in between the indexes N and M (both inclusive) in descending order. (Indexing starts from 0).

Input Format:
First line contains T - number of test cases.
Next T lines contains a string(S) and two numbers(N, M) separated by spaces.

Output Format:
Print the modified string for each test case in new line.

SAMPLE INPUT
3

hlleo 1 3
ooneefspd 0 8
effort 1 4

SAMPLE OUTPUT
hlleo
spoonfeed
erofft
 */

import java.util.Arrays;
import java.util.Scanner;

public class Sort_the_Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt(); // testcase

        //looping for num of test case
        for (int i = 0; i < test_case; i++) {

            String str = s.next(); // string STDIN
            int N = s.nextInt();  // index of N (starting of sorting index)
            int M = s.nextInt();  // index of M (end of sorting index)

            char[] chr = str.toCharArray();  // converting string into char[] array

            char[] index_char = new char[(M - N) + 1]; // getting char to be sorted
            int count = 0;
            for (int j = N; j <= M; j++) {
                index_char[count] = chr[j];
                count++;
            }
            String res = reverse_dec(index_char).trim();  // function call reverse in descending order which return sorted char as string

            char[] chr_bef_sort = new char[N + 1]; // getting char before sorted index N
            for (int k = 0; k < N; k++) {
                chr_bef_sort[k] = chr[k];
            }
            String str_bef_sort = new String(chr_bef_sort).trim();  // converting char before sorted index N into string

            char[] chr_aft_sort = new char[chr.length];  // getting char after sorted index M
            int cnt = 0;
            for (int l = M + 1; l < chr.length; l++) {
                chr_aft_sort[cnt] = chr[l];
                cnt++;
            }
            String str_aft_sort = new String(chr_aft_sort).trim(); // converting char after sorted index M into string

            System.out.println(str_bef_sort + res + str_aft_sort);  // concat the string before and sorted and after

        }
    }

    // function for reversing the sorted char[] array into descending order
    public static String reverse_dec(char[] chr) {

        Arrays.sort(chr);  // sorting char[]

        char[] res_chr = new char[chr.length];

        Stack stack = new Stack(chr.length);

        //using stack pushing sorted element into stack
        for (int i = 0; i < chr.length; i++) {
            stack.push(chr[i]);
        }
        // pop element from stack in descending order and storing in new char[] array
        for (int i = 0; i < chr.length; i++) {
            res_chr[i] = stack.pop();
        }
        return new String(res_chr);  // returning sorted String to main method
    }

}

// stack class
class Stack {
    char[] stack;
    int top = -1;
    int size;

    public Stack(int size) {
        this.size = size;
        stack = new char[size];
        top = -1;
    }

    public void push(char ele) {
        if (!isFull()) {
            top++;
            stack[top] = ele;
        }
    }

    public char pop() {
        return stack[top--];
    }

    public boolean isFull() {
        if (stack.length - 1 == top) {
            return true;
        }
        return false;
    }
}
