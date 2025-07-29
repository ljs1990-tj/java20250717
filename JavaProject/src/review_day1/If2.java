package review_day1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤한 숫자(1~10) 5개를 배열에 넣고
		// 사용자로부터 입력받은 숫자가 배열에 존재하면 "맞췄다!"
		// 없으면 "틀렸다!" 출력
		
		int arr[] = new int[5];
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.print("숫자 입력 : ");
		int input = s.nextInt();
		
//		for(int i=0; i<arr.length; i++) {}
		boolean flg = false; // 내가 입력한 값이 있으면 true로 변경
		for(int num : arr) {
			if(input == num) {
				flg = true;
				break;
			} 
		}
		if(flg) { // flg == true
			System.out.println("맞췄다!");
		} else {
			System.out.println("틀렸다!"); 
		}
		
		
		
		
	}

}
