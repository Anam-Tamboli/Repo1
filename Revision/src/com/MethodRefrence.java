package com;
import java.util.function.BiFunction;
class Subtraction{
	public int sub(int a, int b) {
		return a-b;
	}
}

public class MethodRefrence extends Subtraction {
	public static void main (String args[]) {
		BiFunction<Integer,Integer,Integer>subtract=new Subtraction()::sub;
	int answer=subtract.apply(30,10);
	System.out.println("Subtraction of two number is"+answer);
	}

}
