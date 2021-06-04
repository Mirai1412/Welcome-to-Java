import java.sql.PreparedStatement;
import java.util.Scanner;

public class Boxarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x; // 직사각형의 가로
		double y; // 직사각형의 세로
		double area;
		double perimeter;

		Scanner sc = new Scanner(System.in);

		System.out.println("직사각형의 가로를 입력하세요 : ");
		x = sc.nextDouble();

		System.out.println("직사각형의 세로를 입력하세요 : ");
		y = sc.nextDouble();

		area = x * y; // 직사각형의 넓이
		perimeter = 2.0 * x * y; // 직사각형의 둘레

		System.out.println("직사각형의 넓이는 : " + area);
		System.out.println("직사각형의 둘레는 : " + perimeter);
	}

}
