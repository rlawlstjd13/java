public class StarRepeat4 {
	public static void main(String[] args) {
	for(int j = 1; j <= 5; j++) { // 세로 줄  1 ~ 5
		    for (int i = 4; i >= j ; i--){ // 여백
				System.out.print(" ");
			}
			
			for (int i = 2; i <= j; i++) {
				System.out.print("*");
			}
	
			    for (int i = 1; i <= j; i++){
				  System.out.print("*");
			}
			
		System.out.println();	
		}
	}
}	