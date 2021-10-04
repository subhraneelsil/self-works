/*
Created by Subhraneel Sil
On 04.10.2021
***Program to check for automorphic number***
***A number is called an automorphic number if and only if the square of the given number ends with
the same number itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776
,respectively and the last two digits of the square represent the number itself.***
 */

package com.company;
import java.util.*;
public class automorphic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        int m=n*n;
        while(n>0)
        {
            if(n%10 != m%10)
            {
                System.out.printf("%d is not an automorphic number",n1);
                break;
            }
            else
            {
                n = n / 10;
                m = m / 10;
            }
        }
        System.out.printf("%d is an automorphic number",n1);
    }
}
