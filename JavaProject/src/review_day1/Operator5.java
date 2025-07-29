package review_day1;

public class Operator5 {

	public static boolean oddCheck(int num) {
		if(num % 2 == 1 ) {
			System.out.println(num + "는 홀수 입니다.");
			return true;
		} else {
			System.out.println(num + "는 짝수 입니다.");
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 > num2 | oddCheck(num1));
		
	}
}
