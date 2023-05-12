package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		//OutputStream도 1byte처리 stream이다.(따라서 한글 처리는 안 됌)
		OutputStream os = ps;
		//OutputStreamWriter는 2byte 처리가 되는 stream으로 한글 출력이 된다.
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		try {
			osw.write(48148);
			osw.write(48372);
			osw.write("아니야");
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
