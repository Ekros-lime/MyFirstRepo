package ex7;

import java.util.Scanner;

public class java1119 {
    public static void main(String[] args) {
        int t = 0;
        int pos = 1;
        int[] w = new int[1000];
        int[] v = new int[1000];
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of objects: ");
        
        int n = input.nextInt();
        
        System.out.print("Enter the weoghts of objects: ");
        for (int i = 1; i <= n; i++) {
            w[i] = input.nextInt();
        }
        
        while (t < n) {
            int last = 0;
            System.out.print("Container " + pos + " contains objects with weight");
            for (int i = 1; i <= n; i++) {
                if (last + w[i] <= 10 && v[i] == 0) {
                    System.out.print(" " + w[i]);
                    v[i] = 1;
                    last += w[i];
                    t++;
                }
            }
            System.out.println();
            pos++;
        }
    }
}
