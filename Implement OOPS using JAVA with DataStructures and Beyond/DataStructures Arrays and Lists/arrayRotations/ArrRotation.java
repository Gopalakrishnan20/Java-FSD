package arrayRotations;


import java.util.Scanner;

public class ArrRotation {
	public static void Rrot(int arr[], int n)
	{
		for(int i=0;i<n;i++)
		{
			int j,end;
			end=arr[arr.length-1];
			for(j = arr.length-1; j > 0; j--){        
                arr[j] = arr[j-1];    
            }     
            arr[0] = end;    
        }  
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
		
	public static void Lrot(int arr[], int n) {		
		for(int i = 0; i < n; i++){  
            int j, beg;   
            beg = arr[0];  
            for(j = 0; j < arr.length-1; j++){   
                arr[j] = arr[j+1];  
            }    
            arr[j] = beg;  
        }  
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String choice;
		int n;
		int[] arr= new int[] {9,8,7,6,5,4,3,2,1};
		System.out.println("Array Before Rotations");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("\n Which Rotation to be performed:(R/L):");
		choice=in.next();
		System.out.println("No. of times to be rotated:");
		n=in.nextInt();
		
		if(choice.equals("R"))
		{
			Rrot(arr,n);
		}
		else if(choice.equals("L"))
		{
			Lrot(arr,n);
		}
		

	}

}
