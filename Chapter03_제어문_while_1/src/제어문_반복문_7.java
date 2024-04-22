// 파일 출력 / 데이터베이스 출력/ 네트워크 서버
//              |웹        | 애플리케이션 => 자바 => C/C++
import java.util.*;
import java.io.*;
public class 제어문_반복문_7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
        int i=0; 
        while((i=fr.read())!=-1)
        {
        	System.out.print((char)i);
        }
        fr.close();
	}

}
