package test.main;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		//개발자가 코딩하는 위치
		useCar(new Car());
		
		useCar(new Car() {
			@Override
			public void drive() {
				System.out.println("좀더 빨리 달려요");
				}
			}
		);
	}
	
	public static void useCar(Car c) {
		c.drive();
		c.drive();
	}
}
