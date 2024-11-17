package Lab5Task1;

public class Prac1 extends Thread{
	
	public void run(){
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Prac1 t1=new Prac1();
		t1.start();
	}
}
