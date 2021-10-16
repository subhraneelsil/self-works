/*
Created by Subhraneel Sil
On 16.10.2021
***Program to search a given number***
 */
package com.company;

import java.util.Scanner;

public class array2_searching {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int test_ar[] = new int[10];
        System.out.println("Enter number to search: ");
        int ns = sc.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < 10; i++) {
            test_ar[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (test_ar[i] == ns) {
                System.out.printf("Found at position %d", (i + 1));
            }
        }
    }
}
