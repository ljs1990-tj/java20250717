package day6;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit banana = new Fruit("바나나", 1000);
		
//		banana.price = 2000;
		banana.setPrice(1000);
		
		int price = banana.getPrice();
		System.out.println(price);
		
	}
}
