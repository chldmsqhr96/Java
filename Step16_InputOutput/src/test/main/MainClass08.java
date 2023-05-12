package test.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass08 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try { 
			fis = new FileInputStream("C:/acorn202304/myFolder/1.jpg");
			fos = new FileOutputStream("c:\\acorn202304\\myFolder\\copied.jpg");
			while(true) {
				//1바이트씩 읽고
				int readedByte = fis.read();
				System.out.println(readedByte);
				//더이상 읽을 게 없으면 탈출
				if(readedByte==-1)break;
				//읽은 1byte를 출력하기
				fos.write(readedByte);
				fos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch (Exception e) {}
		}
	}
}