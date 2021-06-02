import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 출력하기

		int n;
		int i = 1;
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하시요");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		while (i <= 9) {
			System.out.println(n + "*" + i + "=" + n * i);
			i++;
		}

	}

}
