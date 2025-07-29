package review_day1;

public class Var1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 30; // 정수 => long(21억 이상의 숫자)
		double height = 170.5;
		boolean isMarried = true; // true or false
		
//		char gender = 'M';
//		System.out.println((int) gender);
		
		String name = "홍길동";
		if(age == 30) {
			System.out.println("30 맞다");
		}
		if(name.equals("홍길동")) { 
			// 문자열에서는 '==' 이거 쓰지 말 것
			// String은 클래스이기 때문에
			System.out.println("홍길동 이다");
		}
		
		int a = 30;
		double b = a; // 30.0
		
		double c = 30.5;
		int d = (int) c; // 값의 소실(0.5가 사라짐)
		
		String f = "1";
		System.out.println(f + 1);
		
		int g = Integer.parseInt(f);
		System.out.println(g + 1);
		
		
	}
}
