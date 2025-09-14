package arrays;

import java.util.Scanner;

public class Missing_array {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
    int a[] = new int[n];

    // Step 2: Input array elements
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }
    int totalSum = n * (n + 1) / 2;

    // Step 4: Calculate sum of array elements
    int arraySum = 0;
    for (int i = 0; i < n - 1; i++) {
        arraySum += a[i];
    }

    // Step 5: Missing number = totalSum - arraySum
    int missingNumber = totalSum - arraySum;
    System.out.println("Missing number is: " + missingNumber);

     sc.close();
}
}
