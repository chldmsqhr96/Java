package test.mypac;

public class Test {
	
	public void walk() {
		System.out.println("달려요");
	}
	
	public int getNumber() {
		return 10;
	}
	
	public String getGreeting() {
		return "hi";
	}
	
	public Airplane getPlane() {
		Airplane plane = new Airplane();
		return plane;
	}
	
	//int type을 메소드의 인자로 전달받는 메소드
	public void setNum(int num) {
	}
	//String type을 메소드의 인자로 전달받는 메소드
	public void setName(String name) {
	}
	//Airplane type을 메소드의 인자로 전달받는 메소드
	public void setPlane(Airplane plane) {
	}
	//int, string, Airplane type 세 가지 타입을 메소드의 인자로 전달받는 메소드
	public void doSomething(int num, String name, Airplane plane) {
	}
	
	public void send() {
		System.out.println("case null");
	}
	public void send(int num) {
		System.out.println("case int");
	}
	public void send(String name) {
		System.out.println("case string");
	}
	public void send(Airplane plane) {
		System.out.println("case airplane");
	}
	
}