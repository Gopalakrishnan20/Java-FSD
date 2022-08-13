package array;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[5];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("User Entered Values:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Multi-Dimentional Array");
		int [][]ar=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=in.nextInt();
			}
		}
		System.out.println("Printing 2d Array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar[i][j]);
			}
			System.out.println("\n");
		}		
		in.close();

	}

}
