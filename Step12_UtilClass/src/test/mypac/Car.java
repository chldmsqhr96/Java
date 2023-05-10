package test.mypac;

public class Car {
	private String name;
	
	public Car(String name) {
		this.name=name;
	}
	
	public void drive() {
		System.out.println(this.name + "이(가) 달려요");
	}
}