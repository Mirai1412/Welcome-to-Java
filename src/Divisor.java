import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 약수 계산하기.

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시요 : ");
		int n = sc.nextInt();

		System.out.println(n + "의 약수는 다음과 같습니다.");
		for (int i = 1; i <= n; ++i) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}

		}

	}

}
