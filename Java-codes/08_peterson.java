/*
Created by Subhraneel Sil
On 06.10.2021
***Program to check if the number is a peterson number of not***
***A number is said to be Peterson number if the sum of the factorials of the digit is equal
to the number itself***
***145 is a peterson number because 1!+4!+5!=145***
 */
package com.company;
import java.util.*;
public class peterson {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1,sum=0,dig;
        int n1=num;
        while(num>0)
        {
            dig=num%10;
            for(int i=1;i<=dig;i++)
            {
                fact=fact*i;
            }
            sum+=fact;
            num=num/10;
            fact=1;
        }
        if(sum==n1){
            System.out.printf("%d is PETERSON NUMBER",n1);
        }
        else{
            System.out.printf("%d is not a PETERSON NUMBER",n1);
        }
    }
}
