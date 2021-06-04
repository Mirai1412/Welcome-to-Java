import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x; // 첫 번째 숫자 저장
		int y; // 두 번째 숫자 저장
		int sum; // 합을 저장

		System.out.println("첫번째 숫자 입력:"); // 입력 안내 출력
		x = sc.nextInt(); // 사용자의 첫 번째 숫자를 읽는다.

		System.out.println("두번째 숫자 입력:"); // 입력 안내 출력
		y = sc.nextInt(); // 사용자의 첫 번째 숫자를 읽는다.

		sum = x + y; // 두 개의 숫자를 더한다.

		System.out.println(sum); // 합을 출력한다.

	}

}
