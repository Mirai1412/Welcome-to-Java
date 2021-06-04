import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int x = 0, y = 0;
		int sum = 0;
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

		 x = sc.nextInt();
			
		 y = sc.nextInt();

		 sum = x+y;
		
		
		}
		
		System.out.print(sum);
	}
}