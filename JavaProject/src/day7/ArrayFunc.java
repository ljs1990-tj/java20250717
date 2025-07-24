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
	
	
	
}
