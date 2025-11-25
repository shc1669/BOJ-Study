package baekjun.array;

import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();       // 정수의 개수 
		int[] numArray = new int[N];  // 배열 선언
		
		
		// 받은 정수를 공백으로 구분해서 배열에 넣음
		for ( int i = 0 ; i < numArray.length ; i++ ) {
			
			int number = scan.nextInt();   
			numArray[i] = number ; 
		
		}
		
		int minNum = numArray[0] ;   // 최솟값을 구할 변수+초기화  
		int maxNum = numArray[0] ;   // 최댓값을 구할 변수+초기화
		
		for ( int j = 0 ; j < numArray.length ; j++) {
			
			//1. 최솟값
			if ( minNum > numArray[j]) {
				minNum = numArray[j]; 
			}
			
			// 2. 최댓값
			if ( maxNum < numArray[j]) {
				maxNum = numArray[j];
			}
	
			 
		}
		System.out.println(minNum + " " + maxNum);	
	}
}
