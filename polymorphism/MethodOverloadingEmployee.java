package com.polymorphism;

public class MethodOverloadingEmployee {
	//method to print name and id
   public void print_info(String name,int id) {
	   System.out.println("Employee Name:"+name+",ID:"+id);
   }
   
   //method to print id and salary
   public void print_info(int id,double salary) {
	   System.out.println("Employee ID:"+id+",Salary:"+salary);
   }
   
   //method to print name and designation
   public void print_info(String name, String desg) {
	   System.out.println("Employee Name:"+name+",Designation:" +desg);
   }
   
   public static void main(String[] args) {
	   MethodOverloadingEmployee e1 =new MethodOverloadingEmployee();
	   
	   //calling different overloaded methods
	   e1.print_info("Ankita", 101);
	   e1.print_info(101,500000.0);
	   e1.print_info("Ankita", "Software Engineer");
   }
}
   
  
  
