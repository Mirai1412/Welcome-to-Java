import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int targetSales = 1000;
		int mySales;
		int bonus;
		String result;

		Scanner sc = new Scanner(System.in);

		System.out.println("실적을 입력하십시요(단위:만원): ");
		mySales = sc.nextInt();

		if (mySales >= targetSales) {
			result = "실적을 달성했습니다.";
			bonus = (mySales - targetSales) / 10;
		} else {
			result = "실적을 달성하지 못했습니다.";
			bonus = 0;
		}

		System.out.println(result + "\n" + "보너스 : " + bonus + "만원");

	}

}
