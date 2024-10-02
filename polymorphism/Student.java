package com.polymorphism;

public class Student {
       public void print_info(String name) {
    	   System.out.println("Name of Student:"+name);
       }
       public void print_info(int age) {
    	   System.out.println("Age of Student:"+age);
       }
       public void print_info(String name, int age) {
    	   System.out.println("Basic info of Student:Name:"+name+",Age:"+age);
       }

       public static  void main(String [] args) {
       	   Student s1=new Student();
           s1.print_info("xyz");
           s1.print_info(20);
       	   s1.print_info("Ankita ",21);
       }
}
