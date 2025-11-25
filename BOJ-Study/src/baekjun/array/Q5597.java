package baekjun.array;

import java.util.Scanner;

public class Q5597 {

	
	public static void main(String[] args) {
	
		// 30 명이 제출해야 할 과제를 28명이 제출했는데, 그 중에서 제출안한 학생 2명의 출석번호를 구하는 프로그램 작성
		Scanner scan = new Scanner(System.in);
		boolean[] submitted = new boolean[31]; // 제출했는지 안했는지 체크하는 boolean 배열 선언
		
		
		//1. 입력 받으면서 자리 수를 체크
		for (int i = 0 ; i < 28 ; i++) {
			int num = scan.nextInt(); 
			submitted[num] = true;  // 제출한 학생은 체크처리 
		}
		
		//2. 체크 안 된 학생을 찾기
		for ( int i = 1 ; i <= 30 ; i++) {
			
			if ( !submitted[i] ) {
				System.out.println(i);
			}
		}
		
		
		
	}
	
}
