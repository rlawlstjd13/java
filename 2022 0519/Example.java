// 사용자에게 정수 하나를 입력받아서
// 입력값 -2 ~ +2 범위의 정수를 출력해보세요
// 예) 7-> 5 6 7 8 9
import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시요.");
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		number -= 2;
		
		System.out.println(number);
		number++;
		System.out.println(number);
		number++;
		System.out.println(number);
		number++;
		System.out.println(number);
		number++;
		System.out.println(number);
		number++;
		
		
		/*int x = scan.nextInt(); //7
		
		int a = x - 1; //6
		int b = a - 1; //5 
		int c = x + 1;
		int d = c + 1;
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(x);
		System.out.println(c);
		System.out.println(d);*/
	}
	
}