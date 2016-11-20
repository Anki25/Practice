
public class ThreadEx2 implements Runnable{
	

	public static void main(String[] args) {
		ThreadEx2 ex=new ThreadEx2();
		Thread th=new Thread(ex);
		//th.start();
		th.run();
		System.out.println("Thread started ");
		System.out.println(th.isAlive()); // thread is dead or unstarted
		th.start();
		System.out.println(th.isAlive());
	}

@Override
	public void run() {
		System.out.println("Class is using Runnable");
		
	}



}
