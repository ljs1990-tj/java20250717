package review_day3;

public class Book_Test {
	String title;
	String author;
	int price;
	
	public Book_Test() {
		this("제목 없음", "저자 미상", 0);
	}
	
	public Book_Test(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void bookInfo() {
		// 책 제목: 제목 없음, 저자: 저자 미상, 가격: 0원
		System.out.print("책 제목 : " + title + ", ");
		System.out.print("저자 : " + author + ", ");
		System.out.println("가격 : " + price + "원");
	}
	
	public void setInfo(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void discount(int price) {
//		if(this.price - price < 0) {
//			System.out.println("할인 금액이 너무 큽니다. 가격은 0으로 설정됩니다.");
//			this.price = 0;
//		} else {
//			this.price -= price;
//		}
		this.price -= price;
		if(this.price < 0) {
			System.out.println("할인 금액이 너무 큽니다. 가격은 0으로 설정됩니다.");
			this.price = 0;
		}
	}
	
	public int getPrice() {
		return price;
	}
}
