package com.company;
class name{
    int age;
    name(int x){
        this.age=x;
    }
    public void newage(){
        System.out.println(this.age);
    }
//    name()
//    {
//        System.out.println("Hello");
//    }
//    name(int x){
//        this.age=x;
//    }
}
public class parameterized {
    public static void main(String args[]){
        name n1=new name(20);

        n1.newage();
    }
}
