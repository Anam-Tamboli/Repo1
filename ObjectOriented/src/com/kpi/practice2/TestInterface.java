package com.kpi.practice2;

public interface TestInterface {
	public void add(int x, int y);
	default void display()
	{
		System.out.println("Addition of two number");
	}
}
