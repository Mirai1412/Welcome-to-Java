import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x; // ù ��° ���� ����
		int y; // �� ��° ���� ����
		int sum; // ���� ����

		System.out.println("ù��° ���� �Է�:"); // �Է� �ȳ� ���
		x = sc.nextInt(); // ������� ù ��° ���ڸ� �д´�.

		System.out.println("�ι�° ���� �Է�:"); // �Է� �ȳ� ���
		y = sc.nextInt(); // ������� ù ��° ���ڸ� �д´�.

		sum = x + y; // �� ���� ���ڸ� ���Ѵ�.

		System.out.println(sum); // ���� ����Ѵ�.

	}

}
