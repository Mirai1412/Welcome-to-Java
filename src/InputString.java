import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �̸��������
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��Ͻÿ� :");
		name = sc.nextLine();
		
		System.out.println("���̸� �Է��Ͻÿ� :");
		age = sc.nextInt();
		
		System.out.println(name + "�� �ȳ��ϼ���! " + (age) + "���̽ó׿�.");
	}

}
