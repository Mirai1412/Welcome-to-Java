import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է� ���� �μ��� ū���� ����ϴ� ���α׷� �ۼ�

		int x, y;
		int max = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ����:");
		x = sc.nextInt();
		
		System.out.println("�ι�° ����:");
		y = sc.nextInt();

		if (x > y) {
			max = x;
			System.out.println("��ū����" + max + "�Դϴ�");
		} else if (x < y) {
			max = y;
			System.out.println("��ū����" + max + "�Դϴ�");
		} else {
			System.out.println("�μ��� ���� ���Դϴ�.");
		}
	}
}