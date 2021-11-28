/*
Created by Subhraneel Sil
To print the number of punctuations [resent in a string
 */
package com.company;

import java.util.Scanner;

public class punctuations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
