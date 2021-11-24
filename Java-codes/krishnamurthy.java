package com.company;

import java.util.Scanner;

public class krishnamurthy {
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
