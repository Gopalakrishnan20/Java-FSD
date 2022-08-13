package oops;

class Encapsulation extends Encapsulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate obj = new Encapsulate(); 
        obj.setName("Gopalakrishnan"); 
        obj.setAge(22); 
        obj.setRoll(18134023); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll()); 

	}

}
