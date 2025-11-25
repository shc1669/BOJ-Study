package baekjun.array;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int[] intArray = new int[N];
		
		for ( int i = 0 ; i < intArray.length ; i++) {
			int A = scan.nextInt(); 
			intArray[i] =  A ;
		}
		
		for ( int number : intArray) {
			
			if ( X > number ) {
				System.out.print(number + " ");
			}
			
		}
		
	}
}
