package review_final;

public class Student extends Person{

	int stuNo;
	
	public Student(String name, int age, double height, int stuNo){
		super(name, age, height);
		this.stuNo = stuNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student student = (Student) obj;
		// this(kim의 객체), student(kim2의 객체)
		if(this.getName() == student.getName() && this.getAge() == student.getAge() &&  this.getHeight() == student.getHeight()) {
			return true;
		}
		return false;
	}
	
	public void study() {
		System.out.println("공부 중");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("학식을 먹는다.");
	}
}
