package ArithmeticCal;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt;
		char flag;
		double a,b,ans;
		Scanner s=new Scanner(System.in);
		do {
		System.out.println("Enter value of A:");
		a=s.nextDouble();
		System.out.println("Enter value of B:");
		b=s.nextDouble();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your option:");
		opt=s.nextInt();
		switch(opt) {
		case 1:
			System.out.println("The Sum is:"+a+b);
			break;
		case 2:
			ans=a-b;
			System.out.println("The Difference is:"+ans);
			break;
		case 3:
			System.out.println("The Product is:"+a*b);
			break;
		case 4:
			System.out.println("The Division value is"+a/b);
			break;
		default:
			System.out.println("Invalid Option");
			break;
		}
		System.out.println("Do you want to continue Y/N:");
		flag=s.next().charAt(0);
		}
		while(flag=='Y'||flag=='y');
		System.out.println("Thank you");
		s.close();
		

	}

}
