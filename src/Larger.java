import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력 받은 두수중 큰수를 출력하는 프로그램 작성

		int x, y;
		int max = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수:");
		x = sc.nextInt();
		
		System.out.println("두번째 정수:");
		y = sc.nextInt();

		if (x > y) {
			max = x;
			System.out.println("더큰수는" + max + "입니다");
		} else if (x < y) {
			max = y;
			System.out.println("더큰수는" + max + "입니다");
		} else {
			System.out.println("두수는 같은 값입니다.");
		}
	}
}