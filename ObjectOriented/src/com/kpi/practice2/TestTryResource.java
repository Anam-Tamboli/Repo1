package com.kpi.practice2;
import java.util.*;
public class TestTryResource {
	public static void main(String args[]) {
	try (Scanner sc=new Scanner(System.in))
			{
		System.out.println("Enter First No:-");
		int a=sc.nextInt();
		System.out.println("Enter Second No:-");
		int b=sc.nextInt();
		System.out.println("Enter Third No:-");
		int c=sc.nextInt();
		int d=a+b+c;
		System.out.println("Total"+d);
		
	}
			catch(Exception e)
	{
				e.printStackTrace();
	}
	finally
	{
		
	}

}
}
