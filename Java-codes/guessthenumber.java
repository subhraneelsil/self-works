/*
Created by Subhraneel Sil
Number Guessing
 */
package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    int number;
    int inputnumber;
    int numberOfGuesses;
    game(){
        Random rand=new Random();
        this.number = rand.nextInt(100);
    }
    public void takeUserInput()
    {
        System.out.println("Guess the number...");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();

    }
    boolean isCorrectNumber()
    {
        if(inputnumber==number) {
            return true;
        }
        else if(inputnumber<number){
            System.out.println("The number is too less...");
        }
        else if(inputnumber>number){
            System.out.println("The number is too high...");
        }
        return false;
    }
    public int numberOfGuesses()
    {
        return numberOfGuesses;
    }
}
public class guessthenumber {
    public static void main(String[] args) {
        game g=new game();
        g.takeUserInput();
       boolean b=g.isCorrectNumber();
        System.out.println(b);
    }
}
