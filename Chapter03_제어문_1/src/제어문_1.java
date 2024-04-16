/*
 *    자바에서 지원하는 제어문
 *     => 프로그램의 흐름
 *       = 건너뛴다 / 실행
 *         조건문
 *       = 여러개 반복 => 반복문
 *         반복문
 *       = 필요한 부분 선택
 *         선택문
 *       = 반복에서 나간다
 *       ------------- 게임 ESC
 *       반복제어문
 *    자바에서 코딩
 *    평문 / 조건문 / 반복문
 *    
 *    1. 조건문
 *       단일조건문
 *            |--> 부정연산자, 비교연산자, 논리연산자만 사용이 가능
 *             조건이 true일 경우에 수행하는ㄴ 문장 -> false면 스킵
 *         {
 *       선택조건문
 *       if(조건문)
 *       {
 *           실행문장 ==> 조건문이 true => id/pwd ==> login
 *       }
 *       else
 *       {
 *           실행문장 ==> 조건문이 false => id/pwd 불일치 메시지 전송
 *       }
 *       다중조건문             ///////여기 필기 못함//////////
 *        if(조건문)
 *       {
 *           
 *       }
 *       else if(조건문)
 *       {
 *           
 *       }
 *       else if(조건문)
 *       {
 *           
 *       }
 *       else
 *       {
 *           
 *       }
 *       
 *       *** 중첩
 *       if(조건문)
 *       {
 *          if(조건문)
 *          {
 *          
 *          }
 *       } 
 *       if(조건 && 조건)
 *       {
 *       
 *       }
 *         
 *    2. 선택문
 *       switch~case
 *    3. 반복문
 *       for : 반복 횟수가 지정된 경우 => 10번 반복
 *       while : 반복 횟수가 없는 경우 => 서버 , 게임, 데이터베이스 연동
 *       do~while : 반드시 한번 이상 수행
 *    4. 반복제어문
 *       break => 반복수행을 종료
 *       continue => 특정 부분을 제외
 *    *** 모든 제어문은 바로 밑에 있는 문장만 제어할 수 있다
 *    
 *    예)
 *       if(조건문)
 *         문장1 => if문이 제어
 *         문장2 => 일반문장
 *         
 *       문장 2개를 동시에 제어
 *       if(조건문)
 *       {
 *         문장1
 *         문장2
 *       }
 * 
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한개의 점수를 받는다 => 60점이상 합격 / 60점이하 불합격
        int score=(int)(Math.random()*101);
        System.out.println("score="+score);
       /*if(score>=60)
        {
        	 System.out.println("합격");
        }
        
        if(score<60)
        {
        	System.out.println("불합격");
        }*/
        System.out.println(score>=60?"합격":"불합격");
        
        
	}

}
