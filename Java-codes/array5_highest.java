/*
Created by Subhraneel Sil
On 19.10.2021
***Largest element of the array***
 */
package com.company;

import java.util.Scanner;

public class array5_highest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        int temp;
        for(int i=0;i<5;i++) {
            ar[i] = sc.nextInt();
        }
        int max = ar[0];

        for (int i = 0; i <5; i++) {

            if(ar[i] >max)
                max = ar[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
