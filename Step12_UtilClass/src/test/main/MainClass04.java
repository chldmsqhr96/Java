package test.main;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();	
		//car 객체 3개 생성
		
		Car c1 = new Car("a");
		Car c2 = new Car("b");
		Car c3 = new Car("c");
		
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		
		//일반 for문 이용해서 list 객체에 저장된 모든 car 객체 drive()메소드 호출
		for (int i = 0; i<cars.size(); i++) {
			Car tmp = cars.get(i);
			tmp.drive();
		}
		
		//확장 for문 이용해서 list 객체에 저장된 모든 car 객체 drive()메소드 호출
		for (Car car : cars) {
			car.drive();
		}
		
		//Consumer 인터페이스를 사용해서 list 객체에 저장된 모든 car 객체 drive()메소드 호출(foreach)
		cars.forEach(new Consumer<>() {
			@Override
			public void accept(Car t) {
				t.drive();
			}
		});
	}
}
