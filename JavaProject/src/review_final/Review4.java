package review_final;

import review_day3.Person;
import review_day3.Student;

public class Review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"java", "oracle", "html", "javascript", "jsp"};
		// 배열에서 가장 길이가 긴 문자를 찾아서 출력
		String longStr = "";
		for(int i=0; i<arr.length; i++) {
			if(longStr.length() < arr[i].length()) {
				longStr = arr[i];
			}
		}
		System.out.println(longStr);
		
//		Student stuArr[] = new Student[5];
//		stuArr[0] = new Student("홍길동", 30, "인천", 1234);
		
		Person stuArr[] = new Person[5];
		stuArr[0] = new Student("홍길동", 30, "인천", 1234);
		
		Object objArr[] = new Object[5];
		objArr[0] = 1;
		objArr[1] = "홍길동";
		objArr[2] = new Student("홍길동", 30, "인천", 1234);
	}
}
