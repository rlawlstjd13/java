// 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 
// 3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다.
// -1이 입력되면 종료하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Jungol5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		//int x;
		
		while (true) { // 항상 위에서 아래로.
		System.out.println("정수를 입력하세요.");
		int x = scan.nextInt();
		
		if ( x % 3 == 0) {
			sum = x / 3;
			System.out.println(sum);
			
		} else if (x <= -1) {
			break;
		} else if ( x % 3 != 0) {
			continue;
		} 
		
				
		}
	}
}