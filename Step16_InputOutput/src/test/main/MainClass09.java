package test.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass09 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try { 
			fis = new FileInputStream("C:/acorn202304/myFolder/1.jpg");
			fos = new FileOutputStream("c:\\acorn202304\\myFolder\\copied2.jpg");
			//byte 알갱이를 읽어낼 배열을 미리 준비
			byte[] buffer = new byte[1024];
			int a = 0;
			while(true) {
				//1바이트씩 읽고
				int readedCount = fis.read(buffer);
				a += readedCount;
				System.out.println(a);
				if (readedCount==-1)break; // 읽을 게 없으면 while 탈출
				fos.write(buffer, 0, readedCount);
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