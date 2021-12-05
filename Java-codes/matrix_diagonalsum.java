/*
Created by Subhraneel Sil
 */
package com.company;

import java.util.Scanner;

public class matrix_diagonalsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
