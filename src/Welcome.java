import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재시간의 따른 인사말 출력하기
		
		Date date = new Date();
		int currenHour = date.getHours();
		
		System.out.println("현재시간은 " + date);
		
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
