package constructors;

class vehicle{
	int wheels;
	int seats;
	String model;
	vehicle()	//Default Constructor
	{
		model="Swift";
		seats=5;
		wheels=4;
	}
	vehicle(int w,int s, String m)	//parameterized Constructor
	{
		this.wheels=w;
		this.seats=s;
		this.model=m;
	}
	
}
public class ConstructorsTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle obj =new vehicle();	//default Constructor is invoked
		System.out.println("Specifications of:"+obj.model);
		System.out.println("Wheels:"+obj.wheels);
		System.out.println("Seats:"+obj.seats);
		vehicle obj2 =new vehicle(3,3,"Auto");
		System.out.println("Specifications of:"+obj2.model);//parameterized constructor is invoked
		System.out.println("Wheels:"+obj2.wheels);
		System.out.println("Seats:"+obj2.seats);
		

	}

}
