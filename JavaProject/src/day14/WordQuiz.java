package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class WordQuiz {
	
	public static ArrayList<HashMap<String, String>> quizList(){
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		String[] keys = {
			    "멕시코", "스페인", "프랑스", "영국", "그리스", 
			    "독일", "중국", "러시아", 
			    "일본", "대한민국", "이탈리아", "캐나다", "브라질", 
			    "인도", "이집트", "호주", "터키", "노르웨이"
		};
		String[] values = {
			    "멕시코시티", "마드리드", "파리", "런던", "아테네", 
			    "베를린", "베이징", "모스크바", 
			    "도쿄", "서울", "로마", "오타와", "브라질리아", 
			    "뉴델리", "카이로", "캔버라", "앙카라", "오슬로"
		};
		
		for(int i=0; i<keys.length; i++) {
			HashMap<String, String> map = new HashMap<>();
			map.put(keys[i], values[i]);
			list.add(map);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		ArrayList<HashMap<String, String>> quizList = quizList();
		
		System.out.println("수도 문제 풀이 ! [-1을 입력하면 종료됩니다.]");
		System.out.println("현재 총 " + quizList.size() + "문제가 있습니다!");
		
		while (true) {
			int index = ran.nextInt(quizList.size()); // 랜덤 인덱스 선택
			HashMap<String, String> quiz = quizList.get(index);
			
			String country = "";
			String capital = "";
			for (String key : quiz.keySet()) {
				country = key;
				capital = quiz.get(key);
			}
			
			System.out.print("[" + country + "]의 수도는? >> ");
			String input = s.next();
			
			if (input.equals("-1")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			if (input.equals(capital)) {
				System.out.println("정답!");
			} else {
				System.out.println("오답! 정답은: " + capital);
			}
		}
		
		
	}
}
