package Lab5Task1;
import java.util.Random;

class AlphabetThread extends Thread{
	private volatile boolean running = true;
	
	 public void run() {
	        Random random = new Random();
	        for (char a = 'A'; a <= 'Z'; a++) {
	            if (!running) break; 
	            try {
	                int sleepTime = 100 + random.nextInt(400);
	                System.out.println(a); 
	                Thread.sleep(sleepTime); 
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt(); 
	                break;
	            }
	        }
	 }
	 
	 public void stopPrinting() {
		 running = false;
	 }
}
	 
public class Main { 
	
	public static void main(String[] args) throws InterruptedException {
		AlphabetThread printer = new AlphabetThread();
        printer.start(); 
        Thread.sleep(5000); 
        printer.stopPrinting(); 

	}

}
