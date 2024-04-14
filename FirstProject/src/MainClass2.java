// 출력 형식
/*
 * =system.out.println()
 *                =====lm() => new Line
 *  system.out.println("Hello")
 *  system.out.println("Java")   
 *  Hello
 *  Java
 * =system.out.print() ==> 옆으로 출력
 *  system.out.print("Hello")
 *  system.out.print("Java")
 *  Hello Java
 * =system.out.printF()
 *  서식이 있는 출력
 *  %d => 정수
 *  %f => 실수
 *  %c => 문자
 *  %s => 문자열
 * =자바에서 표현법
 *  정수표현법
 *     = 10진법(0~9) 10, 20...
 *     = 8진법(0~7)  010   ->10진법이랑 구분하기 위해 앞에 0을 붙여
 *                  -
 *     = 16진법 0x10=>16 -> 0x가 앞에 붙어 있으면 16진법
 *                       --=======>색상
 *     = 2진법  0b10  -> 앞에 0b가 붙어
 *             --
 *     ============================================    
 *       10  ,  10L => 64bit  (long)
 *      (int)
 *       => 32bit
 *  실수표현법 => 10.5 , 10.5F
 *             -----  ------ 32bit (4byte)  1byte=>8bit
 *             저장하는 메모리 크기 => 64bit
 *  문자표현법 => 'A' => 한글자만 사용이 가능
 *  문자열표현법 => "Hello" => 여러 문자의 사용이 가능
 *
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(010);
        System.out.println(0x16);
        System.out.println(0b10);
        //System.out.println(100000000L); ->32bit를 넘어서니 오류가 나지(해결법은 L자를 붙여-64BIT) L자로도 안되면 "" 붙여서 문자로 바꿔줘 
        System.out.println("1000000000000");
        System.out.println("\"홍길동\""); //   "홍길동"  => 명령문이 종료하는 반드시 ;(세미콜론) 찍어줘
        System.out.println("c:\\javaDev\\movie.txt");
        
       // if(true) {
      //	->괄호를 열면 알아서 닫혀 엔터치면 들여쓰기도 자동
       // }

       // System.out.println("\"홍길동\""); \\ "홍길동" => 명령문이 종료하는 반드시 "
       // System.out.println("c:\\javaDev\\movie.txt");
       //홍길동 남자 26
       //System.out.print("홍길동/t");
       //System.out.print("남자/t");
       //System.out.print("26");
      /*
       *   *
       *   **
       *   ***
       *   ****
       *   *****
       *   
       *
       *  i    j     i=j  ==>j=i
       *  줄수  별표
       *  1     1
       *  2     2
       *  3     3
       *  4     4
       *  5     5
       *
       *  i     j  ==>역순이면  +
       *  줄수   별표
       *  1     5
       *  2     4
       *  3     3
       *  4     2
       *  5     1
       *  
       */
       for(int i=0;i<=5;i++){
    	   for(int j=0;j<=5-i;j++){
    		   System.out.print("*");
    	   }
    	   System.out.println();
    	   //주석을 걸때는 ctrl+shift+/ == 풀때는 ctrl+shift+\
    	   System.out.println("10 20 30 40 50");
    	   System.out.printf("%-3d%-3d%-3d%-3d%-3d",10,20,30,40,50);
    	   //
    	   //  10 => +
    	   // 10  => -
       }
	  }
}
        
       
        	
	

