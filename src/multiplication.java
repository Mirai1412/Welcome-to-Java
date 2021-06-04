import java.util.Scanner;

public class multiplication {
	public static void main(String[] args) {
		//백준 곱하기문제
		
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = (b % 10) * a;
		int y = (b % 100 / 10) * a;
		int z = (b / 100) * a;
		int t = a * b;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(t);

	}
}