package abstraction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Reader {
	public static void main(String[] args) throws Exception { // 파일 예외처리 미루기
		File file = new File("c:"+File.separator+"data.txt");
      //  FileReader frd = new FileReader(file);  파일입력문자스트림 열기
     //   BufferedReader brd = new BufferedReader(new InputStreamReader(new FileInputStream("c:"+File.separator+"data.txt"),"euc-kr"));
        FileWriter fwt = new FileWriter("out.txt");  // 파일출력문자스트림 열기
        BufferedWriter bwt= new BufferedWriter(fwt);  // 버퍼 출력스트림
        
        String st;
      
       /* while((st = brd.readLine()) != null) { // 파일의 끝에 도달할 때까지 한 줄씩 읽기
            System.out.println(st);  //  한 줄 문자열 화면출력
            bwt.write(st); bwt.newLine();  // 출력파일에 한 줄 문자열 출력
        }
     
        brd.close();  // 스트림 닫기
        bwt.close();  // 스트림 닫기
*/    }


}
