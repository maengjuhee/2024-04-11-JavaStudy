/*
 *      2.	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.

          결과)
            달을 입력하세요(1~12) >> 9
            가을
            
            => 다중 조건 / 선택문
            
            if(조건문)
            {
               조건 true => 문장 수행 => 종료
                    | false 다른 조건을 찾는다
            }
            else if
            {
              조건 true => 문장 수행 => 종료
                    | false 다른 조건을 찾는다
            }
            else 
            {
               해당 조건이 없는 경우에 처리
            }
            
            => 선택문으로 변경
             switch(문자,정수,문자열)
             {
                case 문자(정수,문자열):
                  처리문장
                  break;
             }
            

 */
import java.util.Scanner;
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12) >>");
        int month =scan.nextInt();
       
        if(month ==1 || month==2 || month==12) //패턴이 없어서 이렇게 처리
        {
        	System.out.println("겨울");
        }
        else if (month >=3 && month <=5)
        {
        	System.out.println("봄");
        }
        else if (month >=6 && month <=8)
        {
        	System.out.println("여름");
        }
        else if (month >=9 && month <=11)
        {
        	System.out.println("가을");
        }
        else							
        {
        	System.out.println("존재하지 않는 달입니다");
        }
        System.out.println("=====switch=======");
        switch(month)
        {
        case 3: case 4: case 5: 
            System.out.println("봄");
            break;
        case 6: case 7: case 8: 
            System.out.println("여름");
            break;
        case 9: case 10: case 11: 
            System.out.println("가을");
            break;
        case 12: case 1: case 2: 
            System.out.println("겨울");
            break;
        default:
        	 System.out.println("없는 달입니다");
        }
	}

}
