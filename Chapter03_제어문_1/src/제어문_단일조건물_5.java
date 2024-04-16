// 사칙연산 프로그램 + , - , * , /
// 변수 3
import java.util.Scanner;
public class 제어문_단일조건물_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		int num1, num2;
		char op;
		System.out.println("첫번쨰 정수 입력:");
		num1=Scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		op=Scan.next().charAt(0);
		
		System.out.println("두번쨰 정수 입력:");
		num2= Scan.nextInt();
		// == 숫자(정수,실수) , 문자	
	    if(op=='+')
	    {
	    	System.out.println(num1+"+"+num2+"="+(num1+num2));
	    }
		if(op=='-')
	    {
	    	System.out.println(num1+"-"+num2+"="+(num1+num2));
	    }
		if(op=='*')
	    {
	    	System.out.println(num1+"*"+num2+"="+(num1+num2));
	    }
		if(op=='/')
	    {
			if(num2==0)
			{
			    System.out.println("0으로 나눌 수 없습니다");	
			}
			if(num2!=0)
			   System.out.println(num1+"/"+num2+"="+(num1+num2));
			}
	    	
	    }
	}


