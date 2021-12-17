package com.company;

import java.util.Scanner;

public class sparse_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows, cols, size, count = 0;
        int a[][] =new int[3][3];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        rows = a.length;
        cols = a[0].length;
        size = rows * cols;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(a[i][j] == 0)
                    count++;
            }
        }
        if(count > (size/2))
            System.out.println("Given matrix is a sparse matrix");
        else
            System.out.println("Given matrix is not a sparse matrix");
    }
}

