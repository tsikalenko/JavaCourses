package lection2;
import java.util.Scanner;

public class Lection2HomeWorkTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ����� ������ ������� ������������:");
		double a = sc.nextDouble();
		System.out.println("������� ����� ������ ������� ������������:");
		double b = sc.nextDouble();
		System.out.println("������� ����� ������ ������� ������������:");
		double c = sc.nextDouble();
		
		double p = (a+b+c)/2;
		
		System.out.println("������� �������� ������������ = " + (Math.sqrt(p*(p-a)*(p-b)*(p-c))));
		
		sc.close();
	}
}