package baekjun.For;

import java.util.Scanner;

public class Q8393 {

	
	/*n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성*/
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int sum = 0 ;
		
		for ( int i = 0 ; i <= n ; i++) {
			
			
			sum += i ; 
			
			
		}
		System.out.print(sum);
	}
}
