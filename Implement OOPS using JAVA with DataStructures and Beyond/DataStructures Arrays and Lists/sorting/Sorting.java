package sorting;

public class Sorting {
	public static void sort(int arr[],int n)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++) 
			{
				
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
			
		}
		System.out.println("\n Array after sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n The Nth smallest no. in the array is:"+arr[n-1]);
		
		
	}

	public static void main(String[] args) {
		int[] arr= {58,45,12,30,9,48,87};
		int n=4;
		System.out.println("Array before sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sort(arr,n);
		
	}

}
