/*
Created by Subhraneel Sil
On 10.10.2021
***Spy number is number whose sum of the digit and product of the digits are same***
***132 is a spy number as 1+3+2=1*3*2***
 */
package com.company;
import java.util.*;
public class spy {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,dig,sum=0,product=1,temp;
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            dig=num%10;
            sum=sum+dig;
            product=product*dig;
            num=num/10;
        }
        if(sum==product)
        {
            System.out.printf("%d is a SPY number",temp);
        }
        else
        {
            System.out.printf("%d is not a SPY number",temp);
        }
    }
}
