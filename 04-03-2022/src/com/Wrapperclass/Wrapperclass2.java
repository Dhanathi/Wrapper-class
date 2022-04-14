package com.Wrapperclass;

public class Wrapperclass2 
{

	public static void main(String[] args) 
	{
		
		float price = 50.35f;
		
		//Float f = price;
		Float f = Float.valueOf(price);
		
		System.out.println(f);
		
		System.out.println("*********");
		
		Float f2 = new Float(70.50f);
		
		//float value = f2;
		float value = f2.floatValue();		
		
		System.out.println(value);
		
		
	}

}
