/*
Created by Subhraneel Sil
***To print the elements on even positions***
 */
package com.company;

import java.util.Scanner;

public class array8_evenelements {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<5;i=i+2)
        {
            System.out.println(ar[i]);
        }
    }
}
