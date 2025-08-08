package review_final;

public class Person {
	// 클래스 => 객체 만든애, 필드(변수) + 메소드
	// 객체 => 클래스를 통해 구체화된 애
	//        변수 + 메소드
	private String name;
	private int age;
	private double height;
	
//	public Person() {};
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void eat() {
		System.out.println("밥을 먹는다");
	}
	
	
	// lombok 나중에 이거 쓰면 get, set 메소드 생략이 가능
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
