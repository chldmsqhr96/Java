package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		MyUtil.send();
		String v =  MyUtil.version;
		System.out.println(v);
		
		
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
}