package day4;

import java.util.Arrays;
import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 6개의 공간을 가지는 배열을 만들어서
		// 랜덤한 숫자 1~45사이의 값을 넣기
		// 단, 중복이 없어야 함.
		int arr[] = new int[6];
		Random ran = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(45)+1; // 1~45
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
