package day3;

import java.util.Scanner;

public class Loop_For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 역순으로 출력
		// 9 * 9 = 81
		// 9 * 8 = 72
		// 9 * 7 = 63
		// ...
		// ...
		// 2 * 1 = 2
//		for(int i=9; i>=2; i--) {
//			System.out.println("======= " + i + "단 ========");
//			for(int j=9; j>=1; j--) {
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//		}
		
		
		
		
		// 숫자를 하나 입력받아서 해당 숫자만큼 늘어나는 별찍기
		// ex ) 4를 입력
		// 결과
		// *
		// **
		// ***
		// ****
		
		Scanner s = new Scanner(System.in);
		System.out.print("별 개수 입력 : ");
		int num = s.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
