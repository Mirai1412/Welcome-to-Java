import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���丮 ���ϱ�

		long fact = 1;
		int n;

		System.out.println("������ �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.printf("%d!�� %d�Դϴ�", n, fact);

	}

}
