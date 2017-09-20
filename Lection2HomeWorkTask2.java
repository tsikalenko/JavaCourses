package lection2;
import java.util.Scanner;

public class Lection2HomeWorkTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size first side of the triangle:");
		double a = sc.nextDouble();
		System.out.println("Enter size second side of the triangle:");
		double b = sc.nextDouble();
		System.out.println("Enter size third side of the triangle:");
		double c = sc.nextDouble();
		
		double p = (a+b+c)/2;
		
		System.out.println("Square of the triangle = " + (Math.sqrt(p*(p-a)*(p-b)*(p-c))));
		
		sc.close();
	}
}
