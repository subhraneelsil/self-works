/*
Created by Subhraneel Sil
***Sorting in descending order***
 */
package com.company;

import java.util.Scanner;

public class array7_sorting_decending {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        int temp;
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4-i;j++) {
                if (ar[j] < ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(ar[i]);
        }
    }
}



