package com.october18;

public class Pattern3 {
public static void main(String args[])
{
	//outer loop
	for(int i=1;i<=4;i++)
	{
		//inner loop for space
		for(int j=1;j<=4-i;j++)
		{
			System.out.print(" ");
		}
		//another loop for star 
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
}
