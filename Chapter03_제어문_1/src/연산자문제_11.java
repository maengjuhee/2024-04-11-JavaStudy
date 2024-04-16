import java.util.Scanner;
public class 연산자문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("두개의 정수 입력(10 20):");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("========결과값=========");
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		// +,- 연산 순위가 동일
		// * => +보다 연산 순위가 우선
	}

}
