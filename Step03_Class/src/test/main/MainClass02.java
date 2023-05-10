package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		Car car1=new Car(); // 객체 생성
		
		Car car2=car1; // car2에 car1을 복사 둘은 같은 개체임
					   // car2는 car1의 바로가기 같은 존재
		
		Car car3=null; // 공간만 만들어짐 Car에 접근할 키값이 없음
		
		car1.name = "아반때";
		String a=car1.name;
		String b=car2.name;
		
		car1.drive();
		car2.drive();
		car3.drive(); // 키값이 없기 때문에 Car class의 메소드에 접근할 수 없음
					  // 따라서 car3.drive()는 nullPointer 예외를 불러옴
	}
}
