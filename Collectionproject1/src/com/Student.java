package com;

public class Student {
 String name;
 int age;
 public Student(String name,int age) 
 {
	this.name=name;
	this.age=age;
}
 
@Override
public String toString() {
	return "Age: "+age+"   "+"Name: "+name;
  }
}
