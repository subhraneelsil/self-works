/*
Created by Subhraneel Sil
Program to check for Smith number
 */
package com.company;

import java.util.Scanner;

public class smith {
    static int digits(int x)
    {
        int dig, c = 0;
        while (x > 0)
        {
            dig = x % 10;
            c = c + dig;
            x = x / 10;

        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        n=sc.nextInt();
        for (int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                s+=digits(i);
            }
        }

        if(digits(n)==s){
            System.out.println("Smith Number");
        }
        else {
            System.out.println("Not a Smith number");
        }
    }
}
