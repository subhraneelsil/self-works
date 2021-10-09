/*
Created by Subhraneel Sil
On 02.10.2021
***Program to check for Neon number***
 */
package com.company;
import java.util.*;
public class Neon {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dig,s=0;
        int sq=num*num;
        int temp=sq;
        while(sq>0)
        {
            s=s+(sq%10);
            sq=sq/10;
        }
        if(s==num)
        {
            System.out.printf("%d is a NEON number",num);
        }
        else
        {
            System.out.printf("%d is NOT A NEON number",num);
        }
    }
}
