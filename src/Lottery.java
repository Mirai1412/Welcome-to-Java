
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ζ� Ȯ�� ����ϱ�

		int odds = 1;
		final int n = 45;
		final int k = 6;

		for (int i = 1; i <= k; i++) {
			odds = odds * (n - i + 1) / i;

			System.out.println("�ζ� " + i + "�� ���� Ȯ�� : 1/" + odds);
		}

	}

}
