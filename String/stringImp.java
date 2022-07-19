package string;

public class stringImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1="Example String Example";
		String var2="Example String variable";
		System.out.println(var1.charAt(3));
		System.out.println(var1.codePointAt(1));
		System.out.println(var1.codePointBefore(2));
		System.out.println(var1.codePointCount(0,9));
		System.out.println("Comparision Functions");
		System.out.println(var2.compareTo(var1));
		System.out.println(var2.compareToIgnoreCase(var1));
		System.out.println("String Concatination");
		System.out.println(var1.concat(var2));
		System.out.println(var2.contains(var1));
		System.out.println(var2.endsWith("able"));
		System.out.println(var1.equals(var2));
		System.out.println(var1.equalsIgnoreCase(var2));
		System.out.println(var2.hashCode());
		System.out.println(var2.indexOf("String"));
		System.out.println(var2.isEmpty());
		System.out.println(var1.replace("Example", "Replaced"));
		
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);


	}

}
