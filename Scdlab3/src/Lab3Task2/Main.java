package Lab3Task2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Default Rectangle:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width : " + rectangle.getWidth());
        System.out.println("Area  : " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        
        try {
            System.out.print("\nEnter new length (0.0 < length < 20.0): ");
            double length = scanner.nextDouble();
            rectangle.setLength(length);

            System.out.print("Enter new width (0.0 < width < 20.0): ");
            double width = scanner.nextDouble();
            rectangle.setWidth(width);

            System.out.println("\nUpdated Rectangle:");
            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Width : " + rectangle.getWidth());
            System.out.println("Area  : " + rectangle.calculateArea());
            System.out.println("Perimeter: " + rectangle.calculatePerimeter());
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

}

