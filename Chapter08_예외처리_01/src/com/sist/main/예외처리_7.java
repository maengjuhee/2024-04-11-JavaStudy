package com.sist.main;
//  에러메시지 => 출력
/*
 *    에러 확인
 *    getMessage() : 에러 내용만 출력
 *    printStackTrace() => 권장 사항 => 에러 위치 확인
 *    ------------------------------------------
 *    
 *    Exception : 상속을 내린 모든 클래스의 예외처리 기능을 가지고 있다
 *    ------------------------------------------------------------------------
 *     IOException / SQLException / ClassNotFoundException / RuntimeException
 *     ...
 *    ------------------------------------------------------------------------
 *    RuntimeException : 실행시 예외처리의 모든 기능을 가지고 있다
 *    ----------------
 *      ClassCastException / ArithmeticException / NillPointerException / NumberException
 *     상속에서 크기
 *     ---------- 상속 내리는 클래스가 받는 클래스보다 크다
 *     
 *     class A
 *     class B extends A        ==> A>B
 *             ------- 클래스에서 클래스 상속은 확장한다
 *     interface A
 *     class B implements A     ==> A>B => 인터페이스도 클래스다
 *             ---------- 인터페이스에서 클래스 상속은 구현한다(인터페이스는 구현이 안된 메소드를 가지고 있다)
 *                                             ------ 구현해서 완성된 클래스를 만들어서 사용
 *    -------------------------------------------------------------------------------------
 *        => ClassCastException < RumtimeException < Exception < Throwable
 *        -----------------------------------------------------------------
 *         예외처리
 *         Exception => 예외처리의 최상위 클래스
 *         --------- 모든 예외처리가 첨부되어 있다
 *         => 어떤 에러가 발생했는지 확인
 *            getMessage() , printStackTrace() : 권장
 *            => 에러발생 시 처리 : output창 
 *            
 *    
 */
class AAA
{
	
}
class BBB extends AAA
{
	
}
public class 예외처리_7 {
    String msg; // null => null은 경우에는 연결하는 주소가 없어서 => 메소드를 사용할 수 없다
    // => NullPointException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// int a=Integer.parseInt(" 10"); // 정수 변환
        	// int[] arr=new int[2];
        	// arr[0]=10;
        	// arr[2]=20; // index 초과 => 0,1,2
        	// System.out.println(10/0);
        	// 예외처리_7 a=new 예외처리_7();
            // String s=a.msg.concat("Java"); // 문자열 결합 => + => 오류 발생
            //        ------
            // System.out.println(s);
        	AAA a=new AAA(); // 형변환 할 때는 반드시 생성자가 일치 => 일치하지 않으면 가지고 올 수가 없어
        	BBB b=(BBB)a; // ClassCastException
        }catch(Exception ex)
        {
        	// Exception => 자바에서 지원하는 모든 오류 처리가 가능 => Throwable : Error도 출력 => 웹
        	ex.printStackTrace();
        	// System.out.println(ex.getMessage());
        	// error가 자주 나는 경우 => try~catch
        }
	}

}
