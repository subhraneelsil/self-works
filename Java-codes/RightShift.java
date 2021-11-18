package com.company;

import com.sun.jdi.connect.Connector;
import java.util.Scanner;
public class RightShift {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]={1,2,3,4,5};
        int[] ar1=ar.clone();

        int n= sc.nextInt();
        int m=n-1;
        for(int i=0;i<5;i++)
        {
            if((i+n)<5) {
                ar1[i] = ar1[i + n];
            }
                if ((i + n) > 5)

            {
                System.out.println(ar[m]);
                ar1[i]=ar[m];

                m--;

            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(ar1[i]);
        }
        System.out.println("\n\n\n");
        for(int i=0;i<5;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
