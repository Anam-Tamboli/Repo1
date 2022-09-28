package com.kpi.practice2;

public class DefaultMethod implements TestInterface{


	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x+y);
	}
public static void main(String args[])
{
	DefaultMethod obj= new DefaultMethod();
	obj.display();
	obj.add(2,2);
	
}
}
