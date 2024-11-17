package Lab5Task1;

public class Prac3 extends Thread{
	private volatile boolean running = true;
	
	public void run() {
	        for (int i = 1; i < 5; i++) {
	        	if (!running) break;
	            try {
	                sleep(500);
	                System.out.println(Thread.currentThread().getName()); 
	            } catch (InterruptedException e) {
	                System.out.println(e); 
	            }
	            System.out.println(i); 
	        }
	}
	
	public void stopThread() {
        running = false;
	}
    
	public static void main(String[] args) {
		 Prac3 t1 = new Prac3();
		 Prac3 t2 = new Prac3();
		 Prac3 t3 = new Prac3();
	     
	     t1.start();
	     t2.start();
	     t3.start(); 
	     t3.stopThread(); 
	     System.out.println("Thread t3 is stopped");

	}

}
