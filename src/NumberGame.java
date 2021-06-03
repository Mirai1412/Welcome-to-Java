import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 추측 게임

		int answer = 59; // 정답
		int guess;
		Scanner sc = new Scanner(System.in);
		int tries = 0;
		// 반복
		do {
			System.out.print("숫자을 추측하여 보시오 : ");
			guess = sc.nextInt();
			tries++;

			if (guess > answer)// 사용자가 입력한정수가 정답보다 높으면
				System.out.print("제시한 정수가 높습니다.");
			if (guess < answer)// 사용자가 입력한정수가 정답보다 높으면
				System.out.print("제시한 정수가 낮습니다.");

		} while (guess != answer);
		System.out.print("축하합니다. 시도횟수는 " + tries + "번 입니다.");

	}

}
