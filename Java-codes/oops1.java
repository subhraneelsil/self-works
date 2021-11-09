package com.company;

class human
{
    int age;
    String name;
    String caste;
     public void name()
    {
        System.out.println(this.name);
    }
}
public class oops {
    public static void main(String args[])
    {
        human human1=new human();
        human1.age=10;
        human1.name="Subhra";
        human1.caste="General";
        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.caste);
        human1.name();

    }
}
