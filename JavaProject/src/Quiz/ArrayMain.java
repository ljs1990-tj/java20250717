package Quiz;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 아래 코드가 정상 동작하도록 ArrayFunc 클래스를 만들고
		// maxArr, avgArr, oddArr 메소드 구현하기
		
		int arr[] = {3, 5, 12, 8, 15, 7};
		int max = ArrayFunc.maxArr(arr); // 가장 큰 값을 구하는 maxArr 메소드 구현
		System.out.println("가장 큰 값 : " + max); // 13
		
		double avg = ArrayFunc.avgArr(arr); // 배열의 평균을 구하는 avgArr 메소드 구현
		System.out.println("평균 값 : " + avg); // 8.333...
		
		int oddArr[] = ArrayFunc.oddArr(arr); // 배열에서 홀수들만 따로 떼서 리턴해주는 oddArr 메소드 구현
		System.out.println("홀수들만 도출한 배열 " + Arrays.toString(oddArr)); // [3, 5, 15, 7]
		
	}
}
