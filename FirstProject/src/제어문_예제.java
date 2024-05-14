/*
 * * if문 -> 조건식이 참인 경우에만 지정된 수행문이 실행된다.
 *        
 *       예) 합격입니다.
 *           int score = 89;
 *           if(score>=60)
 *           {
 *              System.out.pruntln("합격입니다.");
 *           }
 *       
 *  *중첩 if문 -> if문 안에 다른 if문을 중첩하여 사용할 수 있다.
 *    
 *       예) 고득점으로 합격입니다.
 *         int score = 89;
 *         if(score>=60)
 *         {
 *           if(score>=80)
 *           {
 *               System.out.print("고득점으로")
 *           }
 *           System.out.println("합격입니다.")
 *         }
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
 *        예) 89점음 합격입니다.
 *        int score = 89;
 *        
 *        if(score>=60)
 *        {
 *           System.out.println(score + "점은 합격입니다.")
 *        }
 *        else
 *        {
 *           System.out.println(score + "점은 불합격입니다.")
 *        }
 *        
 *        예2) score=40인 경우 -> 40점은 불합격입니다.
 *            score=20인 경우 -> 20점은 페널티 대상입니다.
 *            
 *        int score = 40;
 *        
 *        if(score>=60)
 *        {
 *           System.out.println(score + "점은 합격입니다.");
 *        }
 *        else
 *        {
 *           if(score<=30)
 *           {
 *              System.out.println(score+"점은 페널티 대상입니다.")
 *           }
 *           else
 *           {
 *              System.out.println(score+"점은 불합격입니다.")
 *           }
 *        }
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
 *    *switch문 -> if~else if와 비슷하지만 분기의 기준이 조건식이 아닌 특정 값이다.
 *             -> 기준값과 일치하는 case가 없다면 default에 해당하는 기본 수행문이 실행된다
 *     
 *   
 *
 */

public class 제어문_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
