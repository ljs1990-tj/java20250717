package Quiz;

public class Laptop extends Computer{
	private double weight;
	
	public Laptop(String brand, double weight) {
		super(brand);
		this.weight = weight;
	}
	
	public void printSpecs() {
		// Dell 브랜드의 2.5kg 노트북
		System.out.println(getBrand() + " 브랜드의 " + weight + "kg 노트북");
		
	}

	public double getWeight() {
		return weight;
	}
}
