import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ����ϱ�

		int n;
		int i = 1;
		System.out.println("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		while (i <= 9) {
			System.out.println(n + "*" + i + "=" + n * i);
			i++;
		}

	}

}
