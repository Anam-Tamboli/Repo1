package com.kpi.practice;

public class CompileTime {
public static int add(int a, int b) {
	return a+b;
}
	public static double add(double a,double b) {
		return a+b;
}
	public static void main(String args[])
	{
		System.out.println(add(2,2));
		System.out.println(add(3.5,6.5));
	}

}
