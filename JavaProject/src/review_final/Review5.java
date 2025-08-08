package review_final;

public class Review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30, 170.5);
		hong.eat();
		Student kim = new Student("김철수", 25, 180.3, 1234);
		kim.eat();
		
		Person p[] = new Person[3];
		p[0] = hong;
		p[1] = kim;
		
		Student s[] = new Student[3];
		s[0] = kim;
//		s[1] = (Student) hong;
		
		// Student kim = new Student("김철수", 25, 180.3, 1234);
		Student kim2 = new Student("김철수", 25, 180.3, 1234);
		System.out.println(kim == kim2);
		// 그럴리없겠지만
		// 이름, 나이, 키가 모두 동일하다면은 같은 사람으로 인정하는 코드 작성
		// Stuent클래스에 equals메소드를 오버라이딩 해서 구현
		System.out.println(kim.equals(kim2)); // true 나오도록
		
	}
}
