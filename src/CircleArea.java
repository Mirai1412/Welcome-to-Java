import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius; // ���� ������
		double area; // ���� ����

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��Ͻÿ� : ");
		radius = sc.nextDouble();

		area = 3.14 * radius * radius;

		System.out.println("���� ������ : " + area + "�Դϴ�.");

	}

}
