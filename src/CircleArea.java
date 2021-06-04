import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius; // 원의 반지름
		double area; // 원의 면적

		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하시요 : ");
		radius = sc.nextDouble();

		area = 3.14 * radius * radius;

		System.out.println("원의 면적은 : " + area + "입니다.");

	}

}
