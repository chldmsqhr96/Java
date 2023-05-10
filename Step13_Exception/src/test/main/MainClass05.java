package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어할 수 있는 file 객체를 생성해서
		 * 팜조값을 f라는 지역 변수에 담기
		 */
		File f = new File("C:\\acorn202304\\myFolder\\memo.txt");
		
		try {
			if (f.exists()) {
				f.delete();
			}
			else {
				f.createNewFile();
			}
		}
		
		catch(IOException e) {
		
		}
	}
}