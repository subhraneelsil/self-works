package com.company;
class shape{
    String color;
}
class rectangle extends shape{
    //example of inheritance
    //Class rectangle can use the features of shape
}
public class inheritance {
    public static void main(String args[]) {


        rectangle ob = new rectangle();
        ob.color = "red";
        System.out.println(ob.color);
    }
}
