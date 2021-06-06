//
//import java.util.Scanner;
//
//public class Tic_Tac_toe {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		char [][] board = new char[3][3];
//		int x, y;
//
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i<3; i++) {
//			for (int j =0; j<3; j++) {
//				board[i][j] = ' ';
//
//				do {
//					for(int i1 = 0; i1<3; i1++) {
//						System.out.println(" " + board[i1][0]+ "| "
//								+ board[i1][1] +  "| " + board[i1][2]);
//						if(i1 != 2 ) 
//							System.out.println("---|---|---");
//
//					}
//
//					System.out.print("다음 수의 좌표를 입력하시오.");
//					x = sc.nextInt();
//					y = sc.nextInt();
//
//
//					if(board[x][y] != ' ') {	
//						System.out.println("잘못된 위치입니다");
//						continue;
//					} else 
//						board[x][y] = 'x';
//
//					int i1 = 0, j1 = 0;
//					for(i1 = 0; i1<3; i1++) {
//						for(j1 = 0; j1<3; j1++) {
//							if (board[i1][j1] == ' ')
//								break;
//							if (board[i1][j1] == ' ')
//								break;
//
//						}
//						if(i1<3 && j1<3)
//							board[i1][j1] = 'O';
//
//
//					}while(true);
//
//
//				}
//			}
//		}
//	}
//}
