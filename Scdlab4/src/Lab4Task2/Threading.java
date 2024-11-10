package Lab4Task2;

public class Threading {
	public static void main(String[] args) {
		StudentRollNo thread1 = new StudentRollNo();
		DateOfBirth thread2 = new DateOfBirth();
		
		thread1.start();
		thread2.start();
	}
}
