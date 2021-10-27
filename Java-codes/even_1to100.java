/*
Created by Subhraneel Sil
Program to print even numbers from 1 to 100
 */
package com.company;

import java.util.Scanner;

public class even_1to100 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<100;i=i+2)
        {
            System.out.println(i);
        }
    }
}
