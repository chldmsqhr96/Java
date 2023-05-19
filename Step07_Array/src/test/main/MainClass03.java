 package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		String[] name = new String[3];
	
		name[0] = "김구라";
		name[1] = "해골";
		name[2] = "원숭이";

		/*
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		*/
		
		for (int i = 0; i<name.length; i++) {
			System.out.println(name[i]);
		}
	}
}