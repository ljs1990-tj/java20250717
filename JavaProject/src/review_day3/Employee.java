package review_day3;

public class Employee {
	int empId;
	String empName;
	String department;
	int salary;
	String position;
	
	public Employee(int empId, String empName) {
		this(empId, empName, "");
//		this.empId = empId;
//		this.empName = empName;
	}
	
	public Employee(int empId, String empName, String department) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}

	public void setDetails(int salary, String position) {
		this.salary = salary;
		this.position = position;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void empInfo() {
		// ooo(이름) 사원의 사번은 oooo(사번), 직급은 ooo(직급), 급여는 ooo원 입니다.
		System.out.print(empName);
		System.out.print(" 사원의 사번은 ");
		System.out.print(empId);
		System.out.print(", 직급은 ");
		System.out.print(position);
		System.out.print(", 급여는 ");
		System.out.println(salary + "원 입니다.");
	}

	
}
