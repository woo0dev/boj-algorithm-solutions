package level3;

import java.util.Scanner;

public class Solution2739 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int mul = scanner.nextInt();

        if(mul >= 1 && mul <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(mul + " * " + i + " = " + mul * i);
            }
        } else System.out.println("1~9 사이의 정수가 아닙니다.");
    }
}
