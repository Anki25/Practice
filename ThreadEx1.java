
public class ThreadEx1 extends Thread{
	int i;
	public void run(){
		System.out.println("Thread is running" + i++);
	}
	
	
	public static void main(String args[]){
		ThreadEx1 th=new ThreadEx1();
		th.start();
		th.run();
		System.out.println("Thread started");
		System.out.println("Thread ended");
		
	}

}
