package day5;

import java.util.Arrays;

public class SelectionSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,1,5,2};
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
//			int temp = arr[minIndex];
//			arr[minIndex] = arr[i];
//			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
