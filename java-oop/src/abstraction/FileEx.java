package abstraction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @file_name : FileEx.java
 * @author : coolbeat@naver.com
 * @date : 2015. 10. 1.
 * @story : File 입출력 예제
 */
public class FileEx {
	/**
	 * 문자열단위로 전송하는 FileWriter & FilerReader 는 텍스트 형태의 파일민 송수신이 가능
	 * byte배열로 표현되는 이미지 파일같은 경우에는  Stream이 붙은 클래스를 사용
	 * Writer&Reader가 붙은 클래스는 문자형태로 저장
	 * Stream이 붙은 클래스는 byte 형태로 저장
	 * 
	 * BufferedReader, BufferedWriter 를 쓰는 이유
	 * - FileWriter & FilerReader는 데이터를 저장하거나 불러올때 char단위로 가져와 저장
	 * - Buffer로 감싸주게 되면 char단위를 String단위(문자열)로 묶어서 불러오게되어 
	 * - 하나씩 불러오는 것보다 속도가 빨라짐
	 */
	public static void main(String arg[]) {
		File file = new File("c:"+File.separator+"msg.txt");
		try {
		//	FileWriter fw = new FileWriter(file);
			BufferedWriter bw = null;//new BufferedWriter(file);

			bw.write("Hello world");
			bw.newLine(); // 줄바꿈을 추가합니다
			bw.write("Hello Java");
			bw.close();

			FileReader fr = new FileReader("c:"+File.separator+"msg.txt");
			BufferedReader br = new BufferedReader(fr);

			StringBuilder sb = new StringBuilder();
			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				sb.append(str);
				sb.append("\n");
			}

			System.out.printf("%s\n", sb.toString());
			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
