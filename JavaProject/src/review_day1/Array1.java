package review_day1;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subjectArr[] = {"java", "oracle", "html", "javascript", "jsp"};
		int scoreArr[] = {90, 85, 60, 95, 100}; 
		
		for(int i=0; i<subjectArr.length; i++) {
			System.out.print("과목명 : " + subjectArr[i] + ", ");
			System.out.println("점수 : " + scoreArr[i]);
		}
		
//		Object obj[] = {1, 1.5, "홍길동", true, new Random()};
//		int arr[] = new int[3]; // {0, 0, 0}
		
		// 점수가 평균을 넘는 과목들을 출력
		// 결과 : '평균이 넘는 과목은 java javascript jsp 입니다'
		
	}
}
