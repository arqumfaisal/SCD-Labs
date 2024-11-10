package Lab4Task2;

public class DateOfBirth extends Thread{
	private int dateOfBirth = 18;
	
	@Override
	public void run(){
		for (int i=1; i<=15; i++){
			int num = dateOfBirth * i;
			System.out.println(dateOfBirth + "x" + i + "=" + num);
		}
	}
}
