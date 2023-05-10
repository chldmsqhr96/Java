package test.main;
import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		new Student(); // 사용하지 않고 버림
		
		new Student().study(); // 한번 사용하고 버림
		
		Student std1 = new Student(); // std1에 값을 참조하여 보관
		std1.study();
	}
} 


