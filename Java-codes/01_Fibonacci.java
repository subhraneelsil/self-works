/*

Created by Subhraneel Sil
Program to print the fibonacci series

*/

public class Fibonacci
{
    public static void main(String args[]) 
    {
            int num1 = 0, num2 = 1, num3,c=10;
            System.out.print(num1 + " " + num2);

            for (int i= 2; i < c; ++i)
            {
                num3 = num1 + num2;
                System.out.print(" " + num3);
                num1 = num2;
                num2 = num3;
            }
    }
}

