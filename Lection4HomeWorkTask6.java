package lection4;

public class Lection4HomeWorkTask6 {

	public static void main(String[] args) {
		boolean a;
		System.out.println("1");
		for (int i = 2; i < 101; i++) {
			a = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					a = false;
					break;
				}
			}
			if(a) {
				System.out.println(i);
			}
		}
	}

}
