package baekjun.FOR;

import java.util.Scanner;

public class Q10950 {

	
	/*
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성
	첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10) 각 테스트 케이스마다 A+B를 출력한다.
	*/
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();  // 테스트 케이스의 개수
		
		int[] arrayT = new int[T];  // 개수만큼 array를 만듦
		
		for ( int i = 0 ; i < arrayT.length ; i++) {
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			arrayT[i] = A + B ;
			
		}
		
		for ( int sum : arrayT) {
		
			System.out.println(sum);
		}
		
	}
}
