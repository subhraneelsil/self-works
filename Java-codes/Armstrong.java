/*
Created by Subhraneel Sil
On 02.10.2021

***Program to check for an Armstrong Number***
 */

package com.company;

import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int dig,sum=0;
        int temp=num;
        while(num>0)
        {
            dig=num%10;
            sum=sum+(dig*dig*dig);
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.printf("%d is an ARMSTRONG NUMBER",temp);
        }
        else
        {
            System.out.printf("%d is NOT AN ARMSTRONG NUMBER",temp);
        }
    }
}
