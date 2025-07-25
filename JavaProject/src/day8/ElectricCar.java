package day8;

public class ElectricCar extends Car {
	private int batteryCapacity;
	
	ElectricCar(String brand, String model, int year, int batteryCapacity) {
		super(brand, model, year);
		this.batteryCapacity = batteryCapacity; 
	}
	
	@Override
	void startEngine() {
		System.out.println(getBrand() + " " + getModel() + "의 전기 모터를 시동합니다.");
	} // 현대 아이오닉5의 전기 모터를 시동합니다.
	
	@Override
	void showInfo() {
		// TODO Auto-generated method stub
//		super.showInfo();
		System.out.print("차량 정보 : ");
		System.out.print(getYear() + "년식 " + getBrand() + " " + getModel());
		System.out.println("(배터리 용량:" + batteryCapacity + "kWh)"); // (배터리 용량: 80kWh)
	}
	
	public int getBatteryCapacity() {
		// TODO Auto-generated method stub
		return batteryCapacity;
	}

}
