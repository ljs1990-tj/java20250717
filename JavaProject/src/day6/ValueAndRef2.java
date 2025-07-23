package day6;

import java.util.Arrays;

public class ValueAndRef2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = a;
		b = b + 3;
		System.out.println(a);
		
		int arr[] = {1,2,3,4,5}; // arr => 2bbaf4f0
		int copyArr[] = arr;  // arr => 2bbaf4f0, copyArr => 2bbaf4f0
		copyArr[2] = 10000; // 2bbaf4f0주소에 있는 2번에 인덱스의 값을 10000
		
		// arr, copyArr은 같은 주소를 공유하고 있기 때문에
		// 한쪽에서 수정하면 다른쪽에 동일하게 영향을 받는다.
		System.out.println(Arrays.toString(arr));
		
	}
}
