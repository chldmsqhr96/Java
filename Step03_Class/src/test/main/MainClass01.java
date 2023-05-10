package test.main;
import test.mypac.Car;
import test.mypac.Person;

public class MainClass01 {
	public static void main(String[] args) {
		// Car 클래스를 통해 객체 생성, 생성된 객체의 참조값을 car1이라는 지역 변수에 담기
		Car car1 = new Car();
		
		//Car 객체의 참조값에 .을 찍어 필드 참조
		car1.name = "소나타";
		car1.price = 1000;
		car1.drive();
		
		System.out.println(car1.name);
		System.out.println(car1.price);
		
		Car car2 = new Car();
		car2.name = "그랜저";
		car2.price = 2000;
		car2.drive();
		
		System.out.println(car2.name);
		System.out.println(car2.price);
		
		boolean result = car1 == car2; // false		
		System.out.println(result);
		
		Person per1 = new Person();
		per1.name = "김구라";
		per1.num = 555555;
		System.out.println(per1.name);
		System.out.println(per1.num);
		per1.hi();
	}
}
