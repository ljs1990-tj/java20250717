package review_day3;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
//		a = 10;
//		int a = 10;
		
//		Human hong;
//		hong = new Human();
//		Human hong = new Human();
//		hong.name = "홍길동";
//		hong.eat();
//		hong.money = 100000;
//		
//		Human kim = new Human();
//		kim.name = "김철수";
//		System.out.println(kim.money);
		
		int a = 10;
		System.out.println(a);
		
		Human hong = new Human("홍길동", 30, "인천", 10000);
		// qqwwq
		System.out.println(hong.name);
		
		Human kim = new Human("김철수", 25, "서울", 5000);
		// zzxxz
		System.out.println(kim.name);
		
		Human park = new Human("박영희", 20000); // 이름, 소유금액
		Human yu = new Human("유재석", 40, "제주도"); // 이름, 나이, 주소
	}
}
