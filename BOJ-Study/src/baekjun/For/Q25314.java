package baekjun.For;

import java.util.Scanner;

public class Q25314 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); 
		
		int count = ( N / 4 ) ;  // long의 갯수를 구함
		
		for ( int i = 0 ; i < count ; i++ ) {
			
			System.out.print("long ");
		}
		System.out.print("int");
		
	}

}
