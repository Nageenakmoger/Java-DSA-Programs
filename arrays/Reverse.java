package arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size
        int n = sc.nextInt();
        int a[] = new int[n];

        // Step 2: Input array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Step 3: Print elements in reverse order
        System.out.print("Reversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
