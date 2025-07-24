package day7;

public class ArrayFunc {
	
	static int maxArr(int[] arr) {
		// arr에서 가장 큰 값 찾아서
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static double avgArr(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum/arr.length;
	}
	
	static int[] oddArr(int[] arr) {
		int oddCount = 0;
		for(int value : arr) {
			if(value % 2 == 1) {
				oddCount++;
			}
		}
		// { 3, 5, 12, 8, 15, 7 };
		int oddArr[] = new int[oddCount];
		int oddIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				oddArr[oddIndex++] = arr[i]; // {3,5,15,7}
			}
		}
		return oddArr;
	}
	
}
