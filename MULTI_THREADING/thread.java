package MULTI_THREADING;

class system extends Thread{
	
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

class num extends Thread {
	
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
public class thread {
	
	public static void main (String args[]) throws InterruptedException {
		
		system o = new system();
		num x = new num();
		
		o.start();
		x.start();
		
		System.out.println(o.isAlive());
		
		o.join();
		x.join();
		
		if(o.isAlive())
			System.out.println("still updating");
		else {
			System.out.println("update finished");
		}
		
		System.out.println("bye");
	}

}
