/*
 *   Office
 *   HTML/CSS
 *   Java -Spring
 *   Spring-Boot , JPA
 *   Python
 *   머신러닝 -  딥러닝 -AI
 */
import java.util.Scanner;
public class 제어문_단일조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.print("문자 입력:");
       char c=scan.next().charAt(0);
       // 출력 => 결과값
       // 대문자 => c>='A' && c<='Z'
       // 소문자 => c>='a' && c<='z'
       // 알파벳이 아닌 경우 !((c>='A' && c<='Z')||(c>='a' && c<='z'))
       System.out.println("======결과======");
       if(c>='A' && c<='Z')
       {
    	   System.out.println(c+"는(은) 대문자입니다");
       }
       if(c>='a' && c<='z')
       {
    	   System.out.println(c+"는(은) 소문자입니다");
       }
	}

}
