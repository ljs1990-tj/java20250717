package day15;

import java.util.Scanner;
import java.util.TreeMap;

public class Quiz7 {
	public static void main(String[] args) {
		// 문자열을 입력받아서
		// 문자 빈도 찾기
		// ex) Show Me The Money
		// 결과 : s : 1, h : 2, o : 2, w : 1 ..., y : 1
		// 대소문자 구분없이 같이 카운팅
		// 공백은 체크 x
		Scanner s = new Scanner(System.in);
		TreeMap<String, Integer> map = new TreeMap<>();
		System.out.print("문자열 입력 : ");
		String str = s.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			String word = Character.toString(str.charAt(i)).toLowerCase();
//			word = word.toLowerCase();
			if(word.equals(" ")) { continue; }
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		
		for(String key : map.keySet()) {
			System.out.print("[" + key + " : " + map.get(key) + "] ");
		}
	}
}
