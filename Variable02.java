package days03;

import java.util.Scanner;

public class Variable02
{
	public static void main(String[] args)
	{
		int num1, num2;
		int result1; // 덧셈, 뺄셈, 곱셈의 결과를 저장할 변수
		double result2; // 나눗셈의 결과를 저장할 변수
		
		Scanner sc = new Scanner(System.in); // 화면 입력을 위한 준비 코드
		num1 = sc.nextInt(); 
		// 컴파일러가 sc.nextInt() 명령을 만나면 커서를 깜빡이면서 사용자에게서
		// 입력이 있을 때까지 무한정 대기합니다. 엔터가 최종 입력되면 다음 명령으로 진행합니다.
		System.out.println("입력한 정수는 " + num1 + "입니다.");
	}
}
