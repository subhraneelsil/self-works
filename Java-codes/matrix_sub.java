package com.company;

import java.util.Scanner;

public class matrix_sub{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
                b[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(c[i][j]);
            }
        }
    }
}
