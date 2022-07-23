package diamondPrblm;

interface Greet{
	default void disp(){
		System.out.println("Welcome This is a greet Interface.");
	}
}

interface GoodBye{
	default void disp(){
		System.out.println("Good bye from Goodbye Interface");
	}
}
public class InterfaceImp implements Greet,GoodBye{
	
	public void disp(){
		Greet.super.disp();
		GoodBye.super.disp();
	}

	public static void main(String[] args) {
		InterfaceImp obj=new InterfaceImp();
		obj.disp();

	}

}
