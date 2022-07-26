package com.as;

class defAccess
{
	void display()
	{
		System.out.println("From Default Access specifier");
	}
}
public class defaultAccessSpecifier {

	public static void main(String[] args) {
		
		defAccess d=new defAccess();
		d.display();

	}

}
