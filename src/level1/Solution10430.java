package level1;

import java.util.Scanner;

public class Solution10430 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int r1 = (a + b) % c;
        int r2 = (a % c + b % c) % c;
        int r3 = (a * b) % c;
        int r4 = (a % c * b % c) % c;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}
