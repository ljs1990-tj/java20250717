package day7;

public class TestMain {

	static void test1(int a) {
		System.out.println(a);
	}
	
	static void test2(Person p) {
		System.out.println(p.name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person hong = new Person("홍길동", 30, "인천", 170.1, "남");
		test2(hong);
		Person ewqior = new Person("테스트인물", 30, "인천", 170.1, "남");
		test2(ewqior);
		
		
		Student kim = new Student("김철수", 25, "서울", 180.1, 20251234);
		test2(kim);
//		Person p = kim;
		
		Worker park = new Worker("박영희", 20, "제주도", 165.1);
		
		int number = 10;
		test1(number);
		test1(30);
		test1(90);
	}

}
