package test.main;
import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1.bike 객체를 담을 수 있는 방 3개짜리 배열객체를 생성해서 참조값
		 * 	 bikes라는 지역 변수에 담아보세요.
		 * 2.배열의 각각의 방(0~2)에 bike 객체를 생성해서 담아 보세요
		 * 3.for문을 이용해 순서대로 배열의 각각의 방에 있는 bike 객체의 ride() 메소드를 호출하세요
		 */
		
		Bike[] bikes = new Bike[3];
		
		for(int i = 0; i < bikes.length; i++) {
			bikes[i] = new Bike();
			bikes[i].ride();
		}
		
		//임시 변수를 이용한 확장 for문
		for(Bike tmp:bikes) {
			tmp.ride();
		}
	}
}