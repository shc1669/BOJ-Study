package baekjun.IF;

import java.util.*;

public class Q2480 {

	/*
	 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

		1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
		2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
		3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
		또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
		3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성

		첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어지며, 첫째 줄에 게임의 상금을 출력 한다
	
	 * */
	
	   public static void main(String[] args) {
		
		   Scanner scan = new Scanner(System.in);
		   int num1 = scan.nextInt(); 
		   int num2 = scan.nextInt(); 
		   int num3 = scan.nextInt();
		   
		   int money = 0 ; 
		    
		   if ( num1 == num2 && num2 == num3 ) { // 1. 같은 눈이 3개가 나왔을 경우
			   
			   money = 10000 + (num1 * 1000) ; 
			   
		   } else if ( num1 != num2 && num2 != num3 && num1 != num3 ) { // 2. 전부 눈이 다를경우   
			   
			   // 가장 큰 값을 구해서 
			   int maxNum = 0 ; 
			   
			   if ( num1 >= num2 ) {
				   maxNum = num1 ;
				   
				   if ( maxNum <= num3 ) {
					   maxNum = num3; 
				   }
				   
			   } else if ( num1 < num2 ) {
				   maxNum = num2 ;
				   
				   if ( maxNum <= num3  ) {
					   maxNum = num3 ; 
				   }
			   } 
			   
			   money = maxNum * 100 ; 
			   
			   
		   } else { // 3.  2개의 눈만 같을 경우 
			   
			   // 같은 2개의 눈 추출
			   int sameNum = 0 ; 
			   
			   if ( num1 == num2 || num1 == num3 ) {
				  sameNum = num1;    
			   } else if ( num2 == num3 ) {
				  sameNum = num2;
			   }
			   
			   money = 1000 + ( sameNum * 100);  
		   }
		   
		   System.out.println(money);
	   }
	
	
	
}
