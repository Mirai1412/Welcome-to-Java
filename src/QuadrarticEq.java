
public class QuadrarticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 2�� ������ ���� ����ϴ� �ڵ�
		
		double b = -3.0;
		double c = 2.0;
		
		double disc = b * b - 4.0 * c;
		double sqr = Math.sqrt(disc);
		
		double r1 = (-b + sqr) / 2.0;
		double r2  = (-b - sqr) / 2.0;
		
		System.out.println("����" +  r1);
		System.out.println("����" + r2 );
	}

}