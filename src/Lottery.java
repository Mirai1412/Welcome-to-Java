
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또 확률 계산하기

		int odds = 1;
		final int n = 45;
		final int k = 6;

		for (int i = 1; i <= k; i++) {
			odds = odds * (n - i + 1) / i;

			System.out.println("로또 " + i + "개 맞출 확률 : 1/" + odds);
		}

	}

}
