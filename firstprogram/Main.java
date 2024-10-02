package com.firstprogram;

	public class Main {
		public static void main(String [] args) {
			//object creation
			Pen p1 = new Pen();
			p1.color = "blue";
			p1.type = "gel";
			 System.out.println(p1.color);
			 System.out.println(p1.type);
			 p1.write();
		}

	}
