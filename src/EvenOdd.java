import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if���� �̿��ؼ� Ȧ���� ¦�� ���ϱ�

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.print("¦���Դϴ�");
		} else {
			System.out.print("Ȧ���Դϴ�. ");
		}
		System.out.print("���α׷��� ����Ǿ����ϴ�.");
	}

}
