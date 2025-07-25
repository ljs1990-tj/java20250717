package day8;

public class Car {
	// brand(String), model(String), year(int)
	private String brand;
	private String model;
	private int year;
	
	Car(String brand, String model, int year){
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	void startEngine() {
		System.out.println(brand + " " + model + "의 엔진을 시동합니다.");
	} // 결과 : 현대 쏘나타의 엔진을 시동합니다.
	
	void showInfo() {
		System.out.print("차량 정보 : ");
		System.out.println(year + "년식 " + brand + " " + model);
	} // 차량 정보 : 2022년식 현대 쏘나타
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	
	
}
