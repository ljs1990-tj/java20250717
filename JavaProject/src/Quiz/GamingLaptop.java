package Quiz;

public class GamingLaptop extends Laptop{
	private String graphic;
	
	public GamingLaptop(String brand, double weight, String graphic) {
		super(brand, weight);
		this.graphic = graphic;
	}
	
	@Override
	public void printSpecs() {
		// TODO Auto-generated method stub
		System.out.print(getBrand() + " 브랜드의 " + getWeight() + "kg ");
		System.out.println(graphic + " 게이밍 노트북");
	}
}
