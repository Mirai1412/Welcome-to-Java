import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if문을 이용해서 홀수와 짝수 구하기

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시요 : ");
		number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.print("짝수입니다");
		} else {
			System.out.print("홀수입니다. ");
		}
		System.out.print("프로그램이 종료되었습니다.");
	}

}
