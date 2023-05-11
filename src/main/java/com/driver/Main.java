package com.driver;

public class Main {

    public static void main(String[] args) {


        RWOnly obj=new RWOnly();
       // RWOnly obj1=new RWOnly();



        obj.setName("Firdoush");
        //obj1.setName("Rohan");

        String name=obj.getName();
        //String name1=obj1.getName();

        //java: cannot find symbol

        System.out.println(name);
       // System.out.println(name1);



    }
  
}