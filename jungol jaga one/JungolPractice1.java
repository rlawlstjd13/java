//정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
// 입력 예) 5 출력 예) 1 2 3 4 5
import java.util.Scanner;

public class JungolPractice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수");
		int x = scan.nextInt(); // 입력 값
		int y = 1;
		while (y <= x) {
			System.out.println(y); // 출력 값
			y++;
		}
	}
}