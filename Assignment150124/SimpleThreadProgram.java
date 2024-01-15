package Assignment150124;

public class SimpleThreadProgram extends Thread {
	
	public void run()
	{
		System.out.println("Thread Started...........");
	}
	
	public static void main(String[] args) {
		
		SimpleThreadProgram t1=new SimpleThreadProgram();
		t1.start();
	}
	
	

}
