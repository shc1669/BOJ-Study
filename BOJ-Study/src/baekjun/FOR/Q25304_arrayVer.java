package baekjun.FOR;

import java.util.Scanner;

public class Q25304_arrayVer {


	//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
	/*
	 * 260000
		4
		20000 5   = 배열[0]
		30000 2   = 배열[1]
		10000 6   = 배열[2]
		5000 8    = 배열[3] 
	 * 
	 * */
	
	//Yes
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();  // 총 금액 X
		int N = scan.nextInt();  // 총 갯수 N 
		
		int[] arraySum = new int[N]; 
		int sum = 0 ;
		
		// 총 개수만큼 도는 루프 
		for ( int i = 0 ; i < arraySum.length; i++) { 
			
			int a = scan.nextInt();  // 물건의 가격
			int b = scan.nextInt();  // 물건의 개수 
			
			arraySum[i] = a * b ;
			
		}
		
		for ( int z : arraySum) {
			sum += z ;  
			
		}
		
		
		if ( sum == X ) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		
	}
	
}
	
	