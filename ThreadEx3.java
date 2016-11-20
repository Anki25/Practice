
public class ThreadEx3 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++){
		try{
			System.out.println("thread running");
			Thread.sleep(3456678);
			
		}
		catch(InterruptedException n){
			n.printStackTrace();
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx3 ex=new ThreadEx3();
		Thread th= new Thread(ex);
		th.start();
		th.interrupt();
		System.out.println(th.isAlive());
		th=new Thread();
		th.start();

	}

}
