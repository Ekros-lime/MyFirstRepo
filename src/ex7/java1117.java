package ex7;

import java.util.Scanner;
import java.util.ArrayList;

public class java1117{
    public static void main(String[] args) {
        int ans = 1;
        int i = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a integer m: ");
        int n = input.nextInt();
        int y = 2;
        int temp = n;
        while (temp != 1) {
            if (temp % y == 0) {
                list.add(y);
                temp /= y;
            } else {
                y++;
            }
        }
        y = 2;
        while (i < list.size()) {
            if (list.contains(y)) {
                int num = list.lastIndexOf(y) - i + 1;
                i = list.lastIndexOf(y) + 1;
                if (num % 2 == 1) {
                    ans *= y;
                }
            }
            y++;
        }
        System.out.println("The smallest number n for m * n to be a perfect square is " + Math.sqrt(n * ans));
        System.out.println("m * n is " + ans * n);
    }
}
