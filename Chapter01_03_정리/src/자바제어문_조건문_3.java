/*
 *  == 선택문
 *     if(조건문)
 *     {
 *         조건문이 false일때 수행하는 문장
 *     }
 *            조건
 *      true   |    false
 *     -------------------
 *     |                 |
 *   실행문장            실행문장

 *   => 대문자 / 소문자
 *   =>  양수 / 음수
 *   =>  짝수 / 홀수
 *   => 로그인(o) / 로그인(x)
 *   => 아이디 중복(o)/아이디중복(x)
 *   => 검색어(o) / 검색어(x)
 */
public class 자바제어문_조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A';
        // 대문자 소문자의 차이가 32
        // A => 65, a => 97
        if(c<='A' && c<='Z')
        {
        	System.out.println(c+"는(은) 대문자");
        	System.out.println(c+"의 소문자는 "+((char)(c+32)));
        }
        else
        {
        	System.out.println(c+"는(은) 소문자");
        	System.out.println(c+"의 대문자는 "+((char)(c-32)));
        }
	}

}
