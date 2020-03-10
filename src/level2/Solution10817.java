package level2;

import java.util.Scanner;

public class Solution10817 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int res = 0;

        if (1 <= first && first <= 100 && 1 <= second && second <= 100 && 1 <= third && third <= 100) {
            if (first >= second && first >= third) {
                if (second >= third) {
                    res = second;
                } else res = third;
            } else if (second >= first && second >= third) {
                if (first >= third) {
                    res = first;
                } else res = third;
            } else if (third >= first && third >= second) {
                if (first >= second) {
                    res = first;
                } else res = second;
            }
            System.out.println(res);
        } else System.out.println("1~100까지의 정수가 아닙니다.");
    }
}



