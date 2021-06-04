import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 최대 공약수 찾기

		int x, y, r;
		Scanner sc = new Scanner(System.in);

		System.out.println("두개의 정수를입력하시요(작은수): ");
		x = sc.nextInt();

		System.out.println("두개의 정수를입력하시요(큰수): ");
		y = sc.nextInt();

		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("최대공약수는" + x + "입니다");
	}

}
