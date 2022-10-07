import java.util.Scanner;

public class constants {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final double PI = 3.14;
		double radius;
		double area;
		double circumference;

		System.out.println("Enter the radius of the circle");
		radius = input.nextInt();

		area = PI * radius * radius;
		System.out.println("Area of the circle is: " + area);

		circumference = 2 * PI * radius;
		System.out.println("Circumference of the circle is: " + circumference);

		input.close();
	}
}

// Made by MBlais with ♥