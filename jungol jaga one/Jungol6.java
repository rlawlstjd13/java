//아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가 해당하는 번호 이외의 숫자가 입력되면 "none"라고 출력한 후 종료하는 프로그램을 작성하시오.

// * 각 나라의 수도 : 
// 대한민국 = 서울(Seoul)
// 미국 = 워싱턴(Washington)
// 일본 = 동경(Tokyo)
// 중국 = 북경(Beijing)

// 1. Korea
// 2. USA
// 3. Japan
// 4. China
// number? 1

// Seoul

// * 입출력시 모양은 "입·출력예"와 같이 하시오.​
import java.util.Scanner;


public class Jungol6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number; // 나라숫자 변수
		
		// System.out.println("대한민국 = 서울(Seoul)");
		// System.out.println("미국 = 미국(Washington)");
		// System.out.println("일본 = 동경(Tokyo)");
		// System.out.println("중국 = 북경(Beijing)");
		
		while (true) {
			number = scan.nextInt();
			// System.out.println("1.Korea");
			// System.out.println("2.Usa");
			// System.out.println("3.Japan");
			// System.out.println("4.China");
			// System.out.println("number? 1");
			
			if (number == 1) {
				System.out.println("1.Korea");
			    System.out.println("2.Usa");
			    System.out.println("3.Japan");
			    System.out.println("4.China");
			    System.out.println("number? 1");
				System.out.println("Seoul");
			} else if (number == 2) {
				System.out.println("1.Korea");
			    System.out.println("2.Usa");
			    System.out.println("3.Japan");
			    System.out.println("4.China");
			    System.out.println("number? 2");
				System.out.println("Washington");
			} else if (number == 3) {
				System.out.println("1.Korea");
			    System.out.println("2.Usa");
			    System.out.println("3.Japan");
			    System.out.println("4.China");
			    System.out.println("number? 3");
				System.out.println("Tyoko");
			} else if (number == 4) {
				System.out.println("1.Korea");
			    System.out.println("2.Usa");
			    System.out.println("3.Japan");
			    System.out.println("4.China");
			    System.out.println("number? 4");
				System.out.println("Beijing");
			} else {
				System.out.println("none");
				break;
				
			}
		}
		
	}
}