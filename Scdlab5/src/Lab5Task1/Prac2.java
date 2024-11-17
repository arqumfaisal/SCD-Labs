package Lab5Task1;

class Prac2 extends Thread{
	public void run(){
		for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e); 
            }
            System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Prac2 t1=new Prac2();
		Prac2 t2=new Prac2();		
		t1.start();
		t2.start();
	}
}
