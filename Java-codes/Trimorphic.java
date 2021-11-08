/*
Created by Subhraneel Sil
Program to check Trimorphic number
 */
package com.company;

import java.util.Scanner;

public class Trimorphic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        int m=n*n*n;
        while(n>0)
        {
            if(n%10 != m%10)
            {
                System.out.printf("%d is not an automorphic number",n1);
                break;
            }
            else
            {
                n = n / 10;
                m = m / 10;
            }
        }
        System.out.printf("%d is an automorphic number",n1);
    }
}
