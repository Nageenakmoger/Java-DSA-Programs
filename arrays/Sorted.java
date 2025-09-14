package arrays;

import java.util.Scanner;

public class Sorted {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Step 1: Input size
        int n = sc.nextInt();
        int a[] = new int[n];

        // Step 2: Input array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean sorted = true; // assume array is sorted initially
        for (int i = 0; i < n-1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = false;
                break; // no need to check further
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
        sc.close();
	}
}
