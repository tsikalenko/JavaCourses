package lection2;
import java.util.Scanner;

public class Lection2HomeWorkTask3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите радиус окружности: ");
		double R = sc.nextDouble();
		
		System.out.println("ƒлина окружности = " + (2 * Math.PI * R));
		
		sc.close();
	}
}
