import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ð��� ���� �λ縻 ����ϱ�
		
		Date date = new Date();
		int currenHour = date.getHours();
		
		System.out.println("����ð��� " + date);
		
		if(currenHour < 11) {
			System.out.println("Good morning");
		}else if(currenHour < 15) {
			System.out.println("Good afternoon");
		}else if(currenHour < 20) {
			System.out.println("Good evening");
		}else {
			System.out.println("Good night");
		}
		
		
	}

}
