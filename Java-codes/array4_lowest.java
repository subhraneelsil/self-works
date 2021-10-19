/*
Created by Subhraneel Sil
On 18.10.2021
***Program to print lowest element in the array***
 */
package com.company;

import java.util.*;

public class array4_lowest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        int temp;
        for(int i=0;i<5;i++) {
            ar[i] = sc.nextInt();
        }
        int min = ar[0];

        for (int i = 0; i <5; i++) {

            if(ar[i] <min)
                min = ar[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}
