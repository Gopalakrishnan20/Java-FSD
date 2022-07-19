package inner;

abstract class AnonymousInner{
	public abstract void show();
}
public class InnerClassImp {
	
	private String str="JAVA";
	class Inner{
		void display()
		{
		System.out.println("Welcome to"+str+"From Inner class");
		}		
	}
	void method()
	{
		class InnerMeth{
			void disp(){
			System.out.println("Welcome to"+str+"From Inner class inside Method");
			}
		}
		InnerMeth i=new InnerMeth();
		i.disp();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassImp obj =new InnerClassImp();
		InnerClassImp.Inner i=obj.new Inner();
		AnonymousInner ai=new AnonymousInner(){
			public void show()
			{
				System.out.println("From Anonymous Inner Class");
			}
		};
		i.display();
		obj.method();
		ai.show();
		

	}

}
