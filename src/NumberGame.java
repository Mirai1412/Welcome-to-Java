import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ����

		int answer = 59; // ����
		int guess;
		Scanner sc = new Scanner(System.in);
		int tries = 0;
		// �ݺ�
		do {
			System.out.print("������ �����Ͽ� ���ÿ� : ");
			guess = sc.nextInt();
			tries++;

			if (guess > answer)// ����ڰ� �Է��������� ���亸�� ������
				System.out.print("������ ������ �����ϴ�.");
			if (guess < answer)// ����ڰ� �Է��������� ���亸�� ������
				System.out.print("������ ������ �����ϴ�.");

		} while (guess != answer);
		System.out.print("�����մϴ�. �õ�Ƚ���� " + tries + "�� �Դϴ�.");

	}

}
