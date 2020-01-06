package BasicsIO;

/*
You are required to enter a word that consists of  and  that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if .

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format

First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be .
Output format

Print Yes if the input word can be considered as the string zoo otherwise, print No.

SAMPLE INPUT
zzzoooooo
SAMPLE OUTPUT
Yes
 */

import java.util.*;
import java.io.*;

public class Zoo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().trim();
        char[] cha = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            cha[i] = str.charAt(i);
        }

        int z = 0;
        int o = 0;
        for (char c : cha) {
            if (c == 'z' || c == 'Z') {
                z++;
            } else if (c == 'o' || c == 'O') {
                o++;
            }
        }
        if (z == o / 2) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}
