package review_day2;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		// 오름차순 => Arrays.sort(arr)
		// 내림차순 => ArrayFunc.descSort(arr);
		ArrayFunc.descSort(arr);
		System.out.println(Arrays.toString(arr));
		
		// {
			// {1,2},
			// {3,4},
			// {5,6}
		// }
		
		// new int[3][2]
		int arr2[][] = {
						{10, 5},
						{3, 7},
						{2, 9}
					};
		// arr2[0] => {10, 5}
		// arr2[1] => {3, 7}
		// arr2[2][1] => 9
		
		// arr2 의 모든 값의 합
		int sum = 0;
//		for(int i=0; i<arr2.length; i++) {
//			for(int j=0; j<arr2[i].length; j++) {
//				sum += arr2[i][j];
//			}
//		}
		for(int i=0; i<arr2.length; i++) {
			sum += ArrayFunc.sum(arr2[i]);
		}
		
		
		// ----------
		// 4 * 5 배열에 랜덤한 숫자를 넣으면 좋겠다
		// 랜덤한 숫자의 범위는 10 ~ 50 사이이면 좋겠다
		// ArrayFunc클래스의 randomArr() 함수를 쓰면 좋겠다
		int arr3[][] = new int[4][5];
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = ArrayFunc.randomArr(5, 10, 50);
		}
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
		
		
		
	}
}
