package days04;

public class Operator04 
{
	public static void main(String args[])
	{
		// 논리연산자 &&(And), ||(Or), !(Not)
		// 다수개의 관계(비교)연산식 결과를 조합하여 하나의 boolean 값을 결과로 얻는 연산
		
		int a = 80;
		// a 변수의 값이 70보다 크고 100보다 작으면 true, 아니면 false 출력
		boolean b = a > 70 && a < 100;
		System.out.println("70 < a < 100 : " + b);
		
		// AND 연산자(&&)
		// 좌항과 우항의 관계식 결과 또는 boolean 값이 모두 true인 경우 true가 결과 값
 		// 좌항과 우항 중 하나라도 false인 경우 false가 결과 값
		// 좌항의 비교연산 결과가 false인 경우 우항의 식을 비교하지 않습니다.
		System.out.printf("F && F = %b\n", false && false);
		System.out.printf("T && F = %b\n", true && false);
		System.out.printf("F && T = %b\n", false && true);
		System.out.printf("T && T = %b\n", true && true);
	}
}
