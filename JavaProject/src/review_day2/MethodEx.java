package review_day2;

import day7.Fruit;

public class MethodEx {
	// 0. 클래스 이름으로 접근 가능하도록 다 static을 넣을거임 일단
	// 1. 리턴 타입이 있냐 없냐
	// 1-1. 리턴 값이 있으면 해당 값의 데이터 타입을 메소드명 앞에 넣기
	// 1-2. 리턴 값이 없으면 메소드명 앞에 void 를 넣기
	
	// ex1) 문자열을 리턴하는 testA 라는 이름의 메소드 생성
	public static String testA() {
//		return 1; // 리턴 타입은 String 이므로 숫자 리턴 불가
		
//		return "문자열 리턴"; // 가능
		String name = "홍길동";
		return name; // 가능
	}
	
	// ex2) 리턴 타입이 없는 testB 라는 이름의 메소드 생성
	public static void testB() {
//		return "리턴 할래"; // 리턴타입이 void이므로 리턴 불가
		System.out.println("void라서 리턴 안됨 출력하고 끝");
		
	}
	
	// 2. 매개변수(파라미터)에 대한 처리
	// 2-1. 매개변수의 타입 및 개수, 순서가 중요하다
	public static int testC(int num) {
		return num*2;
	}
	
	public static double testD(int num, double num2) {
		return num * num2;
	}
	
	// 3. 매개변수로는 일반 데이터 타입뿐만 아니라
	// 객체를 받는것도 가능하다
	public static int testE(int[] arr) {
		System.out.println("배열의 0번째 인덱스 값 리턴 합니다.");
		return arr[0];
	}
	
}
