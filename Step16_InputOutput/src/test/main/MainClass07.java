package test.main;
import java.io.File;
import java.io.FileWriter;

public class MainClass07 {
	public static void main(String[] args) {
		String msg = "안녕하세요";
		File f = new File("C:/acorn202304/myFolder/diary.txt");
		
		try {
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("다이어리 파일 생성");
			}
			
			//파일에 문자열을 출력할 수 있는 객체의; 참조값 얻어내기
			FileWriter fw = new FileWriter(f);
			fw.write(msg);
			fw.flush();
			fw.close();
			System.out.println("diary.txt 파일에 문자열을 기록했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
