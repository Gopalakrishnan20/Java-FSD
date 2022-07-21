package threadCreation;

class ThreadClass extends Thread{
	public void run()
	{
		System.out.println("Hello From Thread Class");
	}
}
public class ThreadCreation implements Runnable{
 
    public static int myCount = 0;
    public ThreadCreation(){
         
    }
    public void run() {
        while(ThreadCreation.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++ThreadCreation.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
    	System.out.println("Example of Thread Creation using Runnable method");
        System.out.println("Starting Main Thread...");
        ThreadCreation mrt = new ThreadCreation();
        Thread t = new Thread(mrt);
        t.start();
        while(ThreadCreation.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++ThreadCreation.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
        ThreadClass tc=new ThreadClass();
        System.out.println("Calling Thread Extended class named ThreadClass from main");
        tc.start();
    }
}

