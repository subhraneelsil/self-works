/*
Created by Subhraneel Sil
On 17.10.2021
***Array reversal***
 */
package com.company;

import java.util.Scanner;

public class array3_reverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Reversed array :");
        for(int i=4;i>=0;i--)
        {
            System.out.print(ar[i]);
        }
    }
}
