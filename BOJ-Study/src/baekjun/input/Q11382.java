package baekjun.input;

import java.util.Scanner;

public class Q11382 {
	
	// A+B+C의 값을 출력한다.
	// 77 77 7777 
	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C= scan.nextLong();
		
		long sum = A + B + C ; 
		
		
		System.out.println(sum);
		
	}
}
