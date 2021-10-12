/*
Created by Subhraneel Sil
On 12.10.2021
***Program to add two single dimensional array***
 */
package com.company;

import java.util.Scanner;

public class array1_addition{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar1[]=new int[5];

        for(int i=0;i<ar1.length;i++)
        {
            ar1[i]=sc.nextInt();
        }
        int ar2[]=new int[5];
        for(int i=0;i<ar1.length;i++)
        {
            ar2[i]=sc.nextInt();
        }
        for(int i=0;i<ar1.length;i++)
        {
            System.out.println(ar1[i]+ar2[i]);
        }
    }
}


