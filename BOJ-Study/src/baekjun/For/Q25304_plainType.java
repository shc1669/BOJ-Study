package baekjun.For;

import java.util.Scanner;

public class Q25304_plainType {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();  // ÃÑ ±Ý¾× X
		int N = scan.nextInt();  // ÃÑ °¹¼ö N
		
		int total = 0 ; 
		
		for ( int i = 0 ; i < N; i++) { 
			
			int a = scan.nextInt();  // ¹°°ÇÀÇ °¡°Ý
			int b = scan.nextInt();  // ¹°°ÇÀÇ °³¼ö 
			
			total += a * b ; 
			
		}
		
		if ( total == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}
}
