package DataStructure.Array_String;

/*
Having a good previous year, Monk is back to teach algorithms and data structures. This year he welcomes the learners with a problem which he calls "Welcome Problem". The problem gives you two arrays A and B (each array of size N) and asks to print new array C such that:
Now, Monk will proceed further when you solve this one. So, go on and solve it :)

Input:
First line consists of an integer N, denoting the size of A and B.
Next line consists of N space separated integers denoting the array A.
Next line consists of N space separated integers denoting the array B.

Output:
Print N space separated integers denoting the array C.

SAMPLE INPUT
5
1 2 3 4 5
4 5 3 2 10

SAMPLE OUTPUT
5 7 6 6 15

 */
import java.util.*;

public class Monk_and_Welcome_Problem {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int size = s.nextInt();

        int[] a_array = new int[size];
        int[] b_array = new int[size];

        for (int i = 0 ; i < size ; i++){
            a_array[i] = s.nextInt();
        }
        for (int i = 0 ; i < size ; i++){
            b_array[i] = s.nextInt();
        }

        int[] c_array = new int[size];
        for (int i = 0 ; i < size ; i++){
            c_array[i] = a_array[i]+b_array[i];
        }

        for (int x : c_array){
            System.out.println(x+" ");
        }
    }
}
