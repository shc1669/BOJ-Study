package baekjun.input;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt(); 
		int B = scan.nextInt();
		
		int hundred   = ( B / 100 ) ;          // 백의 자리 걸러냄 
		int tenNamugi = ( B % 100 ) ;          // 십의자리, 일의자리 
		int ten       = ( tenNamugi / 10 ) ;  // 십의 자리 걸러냄
		int one = ( tenNamugi - ten * 10 );
		
		//1. A * B의 첫째자리수 ( 일의자리 )  
		System.out.println( A * one);

		//2. A * B의 둘째자리수 ( 십의자리 )  
		System.out.println( A * ten);
		
		// 3. A * B의 셋째자리 ( 백의자리 ) 
		System.out.println( A * hundred);
		
		System.out.println( A * B);
		
		
		
	}
	
}
