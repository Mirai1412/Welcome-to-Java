import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 팩토리 구하기

		long fact = 1;
		int n;

		System.out.println("정수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.printf("%d!는 %d입니다", n, fact);

	}

}
