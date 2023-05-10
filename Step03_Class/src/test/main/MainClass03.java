package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		
		new Car(); // Car 객체를 생성했으나 사용하지 않고 버림
		new Car().drive(); // Car 객체를 생성하고 1번 사용하고 버림
		
		Car c1=new Car(); // c1을 Car type 지역 변수로 선언
		c1.drive(); // 필요할 때마다 c1에 .을 찍어서 여러번 쓸 수 있음 
		c1.drive();
		
		// Car c2=new Car().drive(); 해당 코드는 리턴이 void이기에 성립될 수 없다.
	}
}