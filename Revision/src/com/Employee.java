package com;

public class Employee {
	Employee(){
		System.out.println();
		}
	Employee(int a, int b){
		System.out.println();
		}
	Employee(String a, String b){
		System.out.println();
		}
	
	public static void main(String args[]) {
		Employee e1=new Employee();
		Employee e2=new Employee(101,100);
		Employee e3=new Employee("trial1", "trial2");
	
	}
}
