package baekjun.array;

import java.util.Scanner;

public class Q10807 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		
		int count = scan.nextInt();        // 입력할 정수의 개수 
		int[] intArray = new int[count];   // 배열 초기화 
		
		for ( int i = 0 ; i < intArray.length ; i++ ) {
			
			int number = scan.nextInt(); 
			intArray[i] = number ;
			
		}
		
		int checkNum = scan.nextInt();   // 찾으려는 정수 
		int result  = 0 ; 
		
		for ( int array : intArray) {
			
			if ( checkNum == array) {  // 배열에 있는 값이 찾으려는 졍수와 같으면 갯수를 ++ 
				result ++ ; 
			}
		}
		
		System.out.println(result);
		
	}
}
