package review_day2;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qqq =  MethodEx.testA();
		System.out.println(qqq);
		
//		String www = MethodEx.testB(); // 리턴이 없는 메소드 이므로 저장 불가
		MethodEx.testB();
		
		int a = 10;
		int b = MethodEx.testC(a);
		
		double c = MethodEx.testD(a, 1.5); // 두개 곱한 값 리턴
		
		int testArr[] = {1,2,3,4,5};
		int d = MethodEx.testE(testArr);
		
	}
}
