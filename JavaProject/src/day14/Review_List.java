package day14;

import java.util.ArrayList;
import java.util.Random;

public class Review_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<>();
		
//		list.add(1); // [1]
//		list.add(30); // [1, 30]
//		list.add(50); // [1, 30, 50]
//		list.add(1, 100); // [1, 100, 30, 50]
		
		// list에 랜덤한 숫자 5개를 넣기
		// 랜덤 숫자의 범위는 1~30, 중복은 일단 상관x		
		
		Random ran = new Random();
		for(int i=0; i<5; i++) {
			int ranNum = ran.nextInt(30)+1; // 1~30
			list.add(ranNum);
		}
		
		System.out.println(list);
		
	}
}
