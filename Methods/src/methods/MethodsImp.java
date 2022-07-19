package methods;

public class MethodsImp {
	
	public void display()
	{
		System.out.println("From Method");
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)//Method Overloading
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20;
		MethodsImp m=new MethodsImp();
		m.display();
		System.out.println("Call By Value");
		System.out.println(add(x,y));//Call by value
		System.out.println("calling Method overloaded methods");
		System.out.println(m.add(x,y,x));
		
		
		

	}

}
