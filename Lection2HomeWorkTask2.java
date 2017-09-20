package lection2;
import java.util.Scanner;

public class Lection2HomeWorkTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите длину первой стороны треугольника:");
		double a = sc.nextDouble();
		System.out.println("¬ведите длину второй стороны треугольника:");
		double b = sc.nextDouble();
		System.out.println("¬ведите длину третей стороны треугольника:");
		double c = sc.nextDouble();
		
		double p = (a+b+c)/2;
		
		System.out.println("ѕлощадь заданого треугольника = " + (Math.sqrt(p*(p-a)*(p-b)*(p-c))));
		
		sc.close();
	}
}