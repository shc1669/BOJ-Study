package baekjun.input;

import java.util.Scanner;

public class Q1008 {

	public static void main(String[] args) {
		
		//실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt(); 
		
		double avg = (double) A / B ; 
		
		System.out.println(avg);
		
	}
}
