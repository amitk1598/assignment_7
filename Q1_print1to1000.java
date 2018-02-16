package acadview_assignment_7;

public class Q1_print1to1000 implements  Runnable {

	public  synchronized void run() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
			System.out.println("Thread name :" +Thread.currentThread().getName());
		}

	}

	public static void main(String[] args) throws InterruptedException {
		Q1_print1to1000 ob = new Q1_print1to1000();
		
		Thread th = new Thread(ob);
		Thread th1 = new Thread(ob);
		
		
		th.start();
		th1.start();
		
		th.join();
		th1.join();

	}



}
