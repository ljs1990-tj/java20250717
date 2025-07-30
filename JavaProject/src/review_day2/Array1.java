package review_day2;

import java.util.Arrays;

public class Array1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 8, 2, 6, 10, 4};
		
		ArrayFunc.minusArr(arr);
		Arrays.sort(arr);
		ArrayFunc.minusArr(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int maxValue = ArrayFunc.max(arr); // 배열내의 가장 큰 값을 리턴
		System.out.println(maxValue);
		
		
	}
}
