/*
 *  조건문
 *  
 *    * if문 -> 조건식이 참인 경우에만 지정된 수행문이 실행된다.
 *        if(조건식)
 *        {
 *           수행문;
 *        }
 *        
 *        
 *    * 중첩 if문 -> if문 안에 다른 if문을 중첩하여 사용할 수 있다.
 *    
 *    
 *    * if~else문 -> 조건식이 거짓인 경우에도 뭔가를 수행하고 싶다면 사용
 *        if(조건식)
 *        {
 *          수행문1;   // 조건식이 true인 경우
 *        }
 *        else(조건식)
 *        {
 *          수행문2;  // 조건식이 false인 경우
 *        }
 *     
 *     
 *    *if~else if문 -> 여러 개의 조건식이 필요한 경우
 *                 -> 참인 조건식이 없다면 맨 마지막 else 기본 수행문이 실행된다
 *                 -> else if의 횟수에는 제한이 없다
 *        if(조건식1)
 *        {
 *           수행문1;
 *        }
 *        else if(조건식2)
 *        {
 *           수행문2;
 *        }
 *        else if(조건식3)
 *        {
 *           수행문3;
 *        }
 *        else
 *        {
 *           기본 수행문;
 *        }
 *        
 *        
 *    *switch문 -> if~else if와 비슷하지만 분기의 기준이 조건식이 아닌 특정 값이다.
 *             -> 기준값과 일치하는 case가 없다면 default에 해당하는 기본 수행문이 실행된다.
 *             -> break를 이용하면 특정 case의 수행문만 실행하고 switch 블록을 종료할 수 있다.
 *             -> default가 무조건 마지막에 위치하는 게 아니라 처음이나 중간에 등장할 수도 있다.(이런 경우에는 default도 break를 사용해야 한다)-> 이렇게 사용하는 경우는 거의 없다
 *        switch(기준값)
 *        {
 *         case 비교값1:
 *            수행문1;
 *         case 비교값2:
 *            수행문2;
 *         default:
 *            기본 수행문;
 *        }
 *   
 *
 */
public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
