import java.sql.PreparedStatement;
import java.util.Scanner;

public class Boxarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x; // ���簢���� ����
		double y; // ���簢���� ����
		double area;
		double perimeter;

		Scanner sc = new Scanner(System.in);

		System.out.println("���簢���� ���θ� �Է��ϼ��� : ");
		x = sc.nextDouble();

		System.out.println("���簢���� ���θ� �Է��ϼ��� : ");
		y = sc.nextDouble();

		area = x * y; // ���簢���� ����
		perimeter = 2.0 * x * y; // ���簢���� �ѷ�

		System.out.println("���簢���� ���̴� : " + area);
		System.out.println("���簢���� �ѷ��� : " + perimeter);
	}

}
