package lection2;
import java.util.Scanner;

public class Lection2HomeWorkTask3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ������ ����������: ");
		double R = sc.nextDouble();
		
		System.out.println("����� ���������� = " + (2 * Math.PI * R));
		
		sc.close();
	}
}
