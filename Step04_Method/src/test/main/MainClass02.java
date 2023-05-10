package test.main;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass02 {
	public static void main(String[] args) {
		Test t = new Test();
		t.send();
		
		// 값을 즉석으로 만들어서 전달
		t.send(new Airplane());
		t.send("abc");
		t.send(10);
		
		//참조되는 값을 전달 가능
		int a = 999;
		t.send(a);
		
		String b = "하이";
		t.send(b);
		
		Airplane c = new Airplane();
		t.send(c);
	}
}
