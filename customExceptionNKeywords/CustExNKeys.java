package customExceptionNKeywords;

class MyException extends Exception{
	public MyException(String s)
	{
		super(s);
	}
}

public class CustExNKeys{
	public void Division() throws ArithmeticException
	{
		int a=10,b=0;
		System.out.println(a/b);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustExNKeys obj=new CustExNKeys();
		int a=40,b=0,ans;
		try {
			if(b==0)
				throw(new ArithmeticException("Can't Divide By Zero"));
			else {
				ans=a/b;
				System.out.println(ans);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		try {
			obj.Division();
		}
		catch(ArithmeticException e){
			System.out.println("Error:"+e.getMessage());
		}
		finally {
			System.out.println("a/b is: Zero");
		}
		try {
			throw new Exception("Custom Exception");
		}
		catch(MyException e){
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}

}
