package BasicsIO;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int fac = Rec(num);
        System.out.println(fac);

    }

    // using recursion function for factorial
    public static int Rec(int num) {
        if (num == 1) {
            return 1;
        }
        return Rec(num - 1) * num;
    }
}
