package com.hierarchical;

//Student class inherits Person
class Student extends Person {
 String course;

 // Constructor for Student class
 public Student(String name, int id, String city, String course) {
     super(name, id, city); // Call the constructor of the Person class
     this.course = course;
 }

 // Method to display student details
 public void displayStudentDetails() {
     displayPersonDetails(); // Call method of Person class
     System.out.println("Course: " + course);
 }
}
