package rangeQueries;

class RangeQueries{
	
 
    public static int query(int[] arr,int f,int t) 
    {
    	int sum=0;
       for(int i=f;i<=t;i++)
       {
    	   sum=sum+arr[i];
       }
       return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 7, 2, 5, 8, 9 }; 
        int n = arr.length; 
        int f=0,t=5;
        System.out.println(query(arr,f,t));
        
	}

}
