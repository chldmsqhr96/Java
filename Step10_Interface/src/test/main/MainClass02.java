package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remo;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		MyRemocon r1 = new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
		
		Remo r4 = new Remo();
		useRemocon(r4);
		r4.reserve();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		/*
		Remo r2 = (Remo)r;
		r2.reserve();
		*/
	}
}
