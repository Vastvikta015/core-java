package com.inheritance;

public class ChildMethodOverriding extends ParentMethodOverriding{
	public void print_info(String name) {
		System.out.println("Child name"+name);
	}
    public static void main(String[] args) {
    	ChildMethodOverriding c1=new ChildMethodOverriding();
    	//c1.name="child";
    	 c1.print_info("Child");
    }
}
