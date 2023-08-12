package MULTI_THREADING;

class systems implements Runnable{
	
	public void run() {
		
		for(int i =1 ; i<=5 ; i++) {
			System.out.println("updating..");
			
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class nums extends Thread {
	
	public void run () {
		
		for(int i = 0; i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class runnable {
	
	public static void main (String args[]) throws InterruptedException {
		
		Runnable o = new systems();
		nums x = new nums();
		
		Thread t = new Thread(o);
		
		t.start();
		x.start();
		
		System.out.println(t.isAlive());
		
		t.join();
		x.join();
		
		if(t.isAlive())
			System.out.println("still updating");
		else {
			System.out.println("update finished");
		}
		
		System.out.println("bye");
	}

}
