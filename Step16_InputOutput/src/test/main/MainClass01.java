package test.main;
import java.io.IOException;
import java.io.InputStream;

/*
 * 입력, 출력(input, output)
 * 
 * - 어떤 대상으로부터 메모리를 읽어들이는 것을 입력이라고 한다.
 * - 프로그래밍 언어 관점에서 메모리라는 것은 변수 or 필드 or 객체로 생각하면 편하다.
 * - 데이터는 2진수로 이루어져 있지만 2진수 8개의 묶음인 1byte 단위로 생각하면 된다.
 * - 1byte는 256가지의 값을 표현할 수 있다.
 * - 1byte를 10진수로 환산하면 0~255 사이의 숫자중 하나이다.
 * - 입력과 출력을 통해서 이동하는 데이터는 byte(byte알갱이) 하나 하나가 이동한다고 생각하면 된다.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		InputStream kbd = System.in;
		
		try {
			System.out.print("입력 : ");
			int code = kbd.read();
			System.out.println("code : " + code);
			char ch = (char)code;
			System.out.println("ch : " + ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}