//자판기 프로그램
//돈입력
//반복하여 입력받아
//1번 콜라 1500
//2번 사이다 1300
//3번계산 
//총 몇개의 캔을 구입하고 거스름돈 출력
import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("돈을 투입하시오");
		int money = scan.nextInt(); // 돈 입력  10000
		// 변수 선언
	    int coke = 0; 
		int ssa = 0;
		int change = 0; //잔돈
		
		boolean con = true;
		
		while (con) {		
			System.out.println("1. 콜라 1500원 2. 사이다 1300원  3. 계산");
			System.out.println(" 고르시오 ");
			int number = scan.nextInt(); // 사는 목록
			if (number == 1) {
				if(money >= 1500) {
					money -= 1500;
					System.out.println("콜라를 선택했습니다");
					coke++;
					
				} else if (number == 2) {
					money -= 1300;
					System.out.println("사이다를 선택했습니다");
					ssa++;
				} else if (number == 3) {
					change = money;
					System.out.println("돈이 부족합니다");
				} else {
					con = false;
				}
			}
			
		} System.out.println(change);
	      
	}
}