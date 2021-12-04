package com.company;

import java.util.Scanner;

class matrix_transpose{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[j][i] ;
            }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(c[i][j]);
            }
        }
    }
}
