package Quiz;

public class ArrayFunc {

	// 1. 가장 큰 수 리턴
	static int maxArr(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	// 2. 평균 값 리턴
	static double avgArr(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum / arr.length; 
	}
	
	// 3. 홀수 배열만 따로 떼서 리턴
	static int[] oddArr(int[] arr) {
		int oddCnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				oddCnt++;
			}
		}
		int oddArr[] = new int[oddCnt];
		int oddIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				oddArr[oddIndex++] = arr[i];
			}
		}
		return oddArr;
	}
	
}
