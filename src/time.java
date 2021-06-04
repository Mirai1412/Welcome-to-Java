import java.util.Scanner;

public class time {
	public static void main(String[] args) {
		// 백준 알람 시계문제
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > 0 && b < 45) {
			System.out.println((a - 1) + " " + (b + 15));

		} else if (a == 0 && b < 45) {

			System.out.println((a + 23) + " " + (b + 15));

		} else if (a > 0 && b < 45) {

			System.out.println((a - 1) + " " + (b + 15));

		} else {

			System.out.println((a) + " " + (b - 45));

		}

	}
}