package com.october18;

public class PyramidNumber {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++)
		{
			//inner loop ->space
			for(int j=1; j<5-i;j++)
			{
				System.out.print(" ");
			}
			//inner loop->number
			for(int j=1; j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
