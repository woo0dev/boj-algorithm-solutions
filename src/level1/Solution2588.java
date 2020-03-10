package level1;

import java.util.Scanner;

public class Solution2588 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r1 = b % 10;
        int r2 = b / 10 % 10;
        int r3 = b / 100 % 10;

        System.out.println(a * r1);
        System.out.println(a * r2);
        System.out.println(a * r3);
        System.out.println(a * b);

    }
}
