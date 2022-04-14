package com.Wrapperclass;

public class Wrapperclass1
{

	public static void main(String[] args) 
	{
		
		byte rank = 21;
		
		Byte x1 = Byte.valueOf(rank);
		
		System.out.println(x1);	
		
		System.out.println("===========================");
		
		//Byte object
		byte myAge = 21;
		Byte age = new Byte(myAge);
		
		
		byte age1 = age.byteValue();
		
		System.out.println(age1);

	}

}
