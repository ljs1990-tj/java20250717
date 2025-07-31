package review_day3;

import java.util.Arrays;

public class RefMain {

	public static int[] returnArr(int[] arr) {
		// 배열을 파라미터로 받아서 0번째 인덱스에 값을 1000으로 변경
		arr[0] = 1000;
		return arr;
	}
	
	public static void voidArr(int[] arr) { // abcde
		// 배열을 파라미터로 받아서 0번째 인덱스에 값을 1000으로 변경
		arr[0] = 1000;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Human hong = new Human("홍길동", 30, "인천", 10000);
////		hong.money = 1000000;
//		Human kim = new Human("김철수", 25, "서울", 5000);
//		System.out.println(kim.money);
//		
//		Human park = hong;
//		park.name = "박영희";
//		
//		System.out.println(hong.name);
		
		
//		int arr[] = {1,3,5,2,4};
//		int arr2[] = {2,5,1,1,1,1};
//		arr2 = arr;
//		arr2[1] = 10000;
//		
//		System.out.println(arr[1]);
		
		int arr[] = {1,3,5,2,4};
//		arr = returnArr(arr);
		voidArr(arr); // abcde
		System.out.println(Arrays.toString(arr));

	}
}
