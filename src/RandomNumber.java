import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �� ����ϱ�
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("������ ���� : ");
		int count = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < count; i++) {
			int number = generator.nextInt(100);
			sum += number;

		}
		System.out.print("���� " + count + "���� ���� " + sum);

	}

}
