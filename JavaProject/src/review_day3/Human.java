package review_day3;

public class Human {
	// 클래스는 필드(변수) + 메소드로 구성되어있다.
	
	// 1. 필드(변수) 영역
	String name;
	int age;
	String addr;
	int money;
	
	// * 생성자 - 클래스 이름과 동일한 이름의 메소드
	public Human(String name, int money) {
		this(name, 0, "", money);
//		this.name = name;
//		this.money = money;
	}
	public Human(String name, int age, String addr) {
		this(name, age, addr, 0);
//		this.name = name;
//		this.age = age;
//		this.addr = addr;
	}
	public Human(String name, int age, String addr, int money) {
		this.name = name; 
		this.age = age;
		this.addr = addr;
		this.money = money;
//		System.out.println(name + "객체 생성!");
	}
	
	
	// 2. 메소드 영역
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}
	
	
	
}
