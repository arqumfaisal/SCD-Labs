package Lab4Task2;

public class StudentRollNo extends Thread{
	private int rollNo = 254;
	
	@Override
	public void run(){
		for (int i=1; i<=15; i++){
			int num = rollNo * i;
			System.out.println(rollNo + "x" + i + "=" + num);
		}
	}
}
