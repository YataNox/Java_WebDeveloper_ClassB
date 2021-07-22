package days06;

public class ControllOpFor01 
{
	public static void main(String args[])
	{
		// 한 번 실행
		System.out.println("겁나 쉬운 자바 프로그래밍~~!!");
		
		// for 명령 : 반복 실행 명령
		for(int i = 0; i < 9; i++)
		{
			System.out.println("겁나 쉬운 자바 프로그래밍~~!!");
		}
		// for 명령 : 반복 실행 명령
		// 괄호 안에 ;으로 구분해서 세가지 내용을 기술해줍니다.
		// 작성되는 세가지 내용은 반복 횟수를 제어할 구성 요소들로 채워집니다.
		// 또한 반복되는 횟수는 특정 변수 값을 통해서 제어 됩니다.
		
		// 첫 번째 요소 : 반복을 제어하는 변수의 최초 값을 설정 또는 대입
		// 두 번째 요소 : 다음 반복을 계속할지 안할지에 대한 관계(비교)연산식
		// 					 (true/false) - 비교 연산식의 결과가 true이면 반복을 계속하고,
		//					 false면 반복을 멈추고 for 영역을 빠져나옵니다.
		// 세 번째 요소 : 반복 제어 변수의 증감 연산
		
		// 반복 제어를 위한 변수를 선언(생성)
		int i ;
		for(i = 1; i <= 10; i++) 
		{
			System.out.println("겁나 쉬운 자바 프로그래밍~~!!");
		}
	}
}
