/*
Created by Subhraneel Sil
On 01.10.2021
***Program to check for palindrome number***
 */
import java.util.*;
public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dig,rev=0,num1=num;
        while(num>0)
        {
            dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        if(num1==rev)
        {
            System.out.printf("%d is a Palindrome number",num1);
        }
        else
        {
            System.out.printf("%d ia not a palindrome number",num1);
        }
    }

}

