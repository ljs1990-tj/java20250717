package day8;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
//		{
//			{1,2,3},
//			{4,5,6},
//			{7,8,9}
//		}
		
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = count++;
			    arr[i][j] = i * arr[i].length + j + 1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
}
