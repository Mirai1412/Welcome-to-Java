import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ִ� ����� ã��

		int x, y, r;
		Scanner sc = new Scanner(System.in);

		System.out.println("�ΰ��� �������Է��Ͻÿ�(������): ");
		x = sc.nextInt();

		System.out.println("�ΰ��� �������Է��Ͻÿ�(ū��): ");
		y = sc.nextInt();

		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("�ִ�������" + x + "�Դϴ�");
	}

}
