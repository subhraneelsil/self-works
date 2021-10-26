/*
Created by Subhraneel Sil
***No. of times a number is repeated within an array***
 */
package com.company;

import java.util.Scanner;

public class array10_repitations {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
        int n,c=0;
        n=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(ar[i]==n);
            {
                c++;
            }
        }
        System.out.println(c);
    }

}
