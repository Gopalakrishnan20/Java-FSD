package com.as;

class priAccess
{
	private void display()
	{
		System.out.println("Fom private Access specifier");
	}
	void pub(){
		System.out.println("can't access private method from main class So, calling within class");
		display();
	}
}
public class privateAccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		priAccess p =new priAccess();
		//p.display();
		//can't access private method from main class
		p.pub();
		
	}

}
