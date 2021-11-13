package com.company;

import java.util.Scanner;

public class roman_to_int {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String hundreds[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousands[]={"","M","MM","MMM"};
        String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String ones[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String s1=thousands[n/1000]+hundreds[(n%1000)/100]+tens[(n%100)/10]+ones[n%10];
        System.out.println(s1);
    }

}
