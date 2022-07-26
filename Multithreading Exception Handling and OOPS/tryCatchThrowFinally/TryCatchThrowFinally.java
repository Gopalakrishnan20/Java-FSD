package tryCatchThrowFinally;

public class TryCatchThrowFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = new int[3];
        System.out.println("Trying to access outof bound element");
        try 
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
        System.out.println("Trying to divide a integer with 0");
        try {
        	System.out.println(5/0);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        finally {
        	System.out.println("Tryed to divide an integer with 0");
        }
	}

}
