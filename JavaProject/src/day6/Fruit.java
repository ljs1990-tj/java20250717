package day6;

public class Fruit {
	private String name;
	private int price;
	
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info() {
		System.out.println(name + "의 가격은 " + price + " 입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
//	int getPrice() {
//		return price;
//	}
//	
//	void setPrice(int price) {
//		
//		if(price <= 0 || price >= 100000) {
//			System.out.println("가격은 다시 확인해주세요.");
//		} else if(false) { // 권한 체크
//			System.out.println("권한이 없는 사용자입니다.");
//		} else {
//			this.price = price;
//		}
//	}
}
