/*
Created by Subhraneel Sil
On 07.10.2021
***Program to check for Tech number***
***A number is called a tech number if the given number has an even number
 of digits and the number can be divided exactly into two parts from the middle.
 After equally dividing the number, sum up the numbers and find the square of the sum.
 If we get the number itself as square,the given number is a tech number, else, not a tech number.
 For example, 3025 is a tech number.***
 */
package com.company;
import java.util.*;
public class tech {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dig,c=0,p,q,sq_sum=0;
        int n=num;
        while(num>0)
        {

            c+=1;
            num=num/10;
        }
        if(c%2==0)
        {
            num=n;
            p=num % (int) Math.pow(10, c / 2);
            q=num / (int) Math.pow(10, c / 2);
            sq_sum=(p+q)*(p+q);
        }
        if(n==sq_sum)
        {
            System.out.printf("%d is a Tech number",n);
        }
        else
        {
            System.out.printf("%d is not a Tech number",n);
        }
    }
}
