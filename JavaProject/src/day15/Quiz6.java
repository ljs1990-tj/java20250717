package day15;

import java.util.HashMap;
import java.util.Random;

public class Quiz6 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[20];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
			// map = {5=2, 7=1, 3=1, 4=1};
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		int max = 0;
		for(int key : map.keySet()) {
			if(max < map.get(key)) {
				max = map.get(key);
			}
		}
		for(int key : map.keySet()) {
			if(max == map.get(key)) {
				System.out.println("가장 많은 수 : " + key + ", 개수 : " + map.get(key));
			}
		}
		
	}
}
