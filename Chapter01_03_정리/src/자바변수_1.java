/*
 *    돈까스 : 8000
 *    칼국수 : 6000
 *    왕만두 : 5000
 *    -----------
 *    주문 돈까스 => 16인분
 *        칼국수 => 8인분
 *        왕만두 => 1인분
 *    --------------------총 계산서를 출력하는 프로그램을 작성
 *    
 */
public class 자바변수_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final int 돈까스=8000;  // final 로 고정(상수)해도 돼
        final int 칼국수=6000;
        final int 왕만두=5000;
        
        System.out.println(돈까스*16+칼국수*8+왕만두);
        
	}

}
