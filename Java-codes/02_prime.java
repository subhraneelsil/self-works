/*

Created by Subhraneel Sil
Program to check for Prime number

*/
import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,p=0,flag=0;
        int n=sc.nextInt();//to accept a number from user
        p=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+" is not prime number");
        }
        else
        {
            for(i=2;i<=p;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(n+" is prime number");
            }
        }
    }
}

