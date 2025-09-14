package arrays;

import java.util.Scanner;

public class Second_Largest {

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
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
        	if (a[i] > m1) {
        		m2 = m1;
        		m1 = a[i];
        	} else if (a[i] > m2 && a[i] != m1) {
        		m2 = a[i];
        	}
        }
        if (m2 == Integer.MIN_VALUE) {
            System.out.println("Not Applicable");
        } else {
            System.out.println("Second largest element is: " + m2);
        }

        sc.close();
	}

}
