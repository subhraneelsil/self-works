/*
Created by Subhraneel Sil
On 01.10.2021
***Multiplying a number by two and three separately, the number obtained by writing the results obtained with
the given number will be called a fascinating number. If the result obtained after concatenation contains
all digits from 1 to 9, exactly once.***
 */
package com.company;
import java.util.*;
public class fascinating {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,num1,num2,num3,flag=0;
        num=sc.nextInt();
        num1=num;
        num2=2*num;
        num3=3*num;
        String s1=String.valueOf(num1)+String.valueOf(num2)+String.valueOf(num3);
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.printf("%d is a FASCINATING NUMBER",num);
        }
        else
        {
            System.out.printf("%d is NOT A FASCINATING NUMBER",num);
        }
    }
}
