// 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
// (넓이는 반올림하여 소수 첫째자리까지 출력한다.)​
// exBase = 11 Height = 5 Triangle width = 27.5 Continue? Y Base = 10 Height = 10 Triangle width = 50.0 Continue? N
// 힌트  문자를 입력받을 때에는 %c 앞에 공백을 넣어 주어야 엔터, 공백과 같은 구분자를 입력받지 않고 한 개의 문자를 입력받을 수 있다. 예 : scanf(" %c", &문자변수);
// 넓이 구하는법 밑변 * 높이 / 2
import java.util.Scanner;

public class JungolPractice5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double sum; // 값
		// System.out.println("삼각형의 밑변 길이 입력:");
		// double x = scan.nextInt();
		// System.out.println("삼각형의 높이 입력:");
		// double y = scan.nextInt();
		while (true) {
			System.out.println("삼각형의 밑변 길이 입력:");
		    double number1 = scan.nextInt();
		    System.out.println("삼각형의 높이 입력:");
		    double number2 = scan.nextInt();
			sum = number1 * number2 / 2;
			System.out.println(sum);
			System.out.println("continue?");
			scan.nextLine();
			String y = scan.nextLine();
			
			if (y.equals("N")) { // 문자열 비교 
				break;

			}
				// System.out.println(sum);
				// System.out.println("Continue?" + "Y");
			// } else if (choice == x) {
				// System.out.println(sum / 2);
				// System.out.println("Continue?" + "N");
				// break;
			// }
				
				
			// }
			// sum = number1 * number2 / 2;
			// System.out.println("Continue?"); //y
			
			
			
			// sum = number1 * number2 / 2;
			// System.out.println(sum);
			// String x = scan.nextLine();
			// String y = scan.nextLine();
		// }
		
	}
}
}