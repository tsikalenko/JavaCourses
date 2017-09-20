package lection2;
import java.util.Scanner;

public class Lection2HomeWorkTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите п€тизначное число и нажмите Enter:");
		int a = sc.nextInt();
		
		System.out.println(a / 10000);
		System.out.println(a % 10000 / 1000);
		System.out.println(a % 1000 / 100);
		System.out.println(a % 100 / 10);
		System.out.println(a % 10);
		
		sc.close();
	}

}
