package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		// 문자열을 1줄 씩 입력받을 수 있는 객체
		BufferedReader br = new BufferedReader(isr);
		*/
		
		//위의 문자열 3줄을 한줄로 표현하면 다음과 같다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("문자열 한 줄 입력 : ");
		
		try {
			String line = br.readLine();
			System.out.println("line : " + line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
