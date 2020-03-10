package level1;

import java.util.Scanner;

public class Solution10869 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = a + b;
        int s = a - b;
        int m = a * b;
        int d = a / b;
        int r = a % b;

        System.out.println(p);
        System.out.println(s);
        System.out.println(m);
        System.out.println(d);
        System.out.println(r);

    }
}
