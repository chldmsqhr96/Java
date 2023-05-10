package test.main;
import test.mypac.Test;

import test.mypac.Airplane;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();
		//return type이 void인 메소드 호출
		t.walk();
		//return type이 int인 메소드를 호출, 리턴 값을 지역변수 a에 담기
		int a = t.getNumber();
		//return type이 String인 메소드 호출, 리턴 값을 b라고 하는 String type 지역변수에 담기
		String b = t.getGreeting();
		//return type이 Airplane인 메소드 호출, 리턴 값을 c라는 Airplane type 변수에 담기
		Airplane c = t.getPlane();
		c.fly();
		
		t.setNum(10);
		t.setName("abcd");
		t.setPlane(new Airplane());
		t.doSomething(10, "abc", new Airplane());
		t.send(new Airplane());
	}
}