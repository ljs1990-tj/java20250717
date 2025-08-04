package day13;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(100);
		list.add(30);
		list.add(1, 500);
//		[3, 500, 100, 30]
		
		list.remove(0);
//		[500, 100, 30]
		
		for(int i=0; i<list.size(); i++) {
			int num = list.get(i);
			System.out.println(num);
		}
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("홍길동");
		strList.add("김철수");
		strList.add("박영희");
		
		for(int i=0; i<strList.size(); i++) {
			String str = strList.get(i);
			System.out.println(str);
		}
		
		ArrayList<Object> objList = new ArrayList<>();
		objList.add(1);
		objList.add("자바");
		objList.add(true);
		objList.add(list);
		objList.add(strList);
		
		
	}
}
