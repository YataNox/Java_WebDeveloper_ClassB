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
		
		//OR 연산자(||)
		// 좌항과 관계식 또는 boolean 값이 하나라도 결과가 true인 경우 true가 결과 값
		// 좌항과 우항 모두 false 경우 false가 결과 값
		// 좌항의 결과가 true인 경우 우항의 식을 비교하지 않습니다.
		System.out.printf("F || F = %b\n", false || false);
		System.out.printf("T || F = %b\n", true || false);
		System.out.printf("F || T = %b\n", false || true);
		System.out.printf("T || T = %b\n", true || true);
		
		//NOT 연산자(!)
		// 단항연산자(피연산자가 1개임)
		// 관계식의 결과를 반대값으로 결과를 냄 true -> false, false -> true
		System.out.printf("!%b = %b\n", false, !false);
		System.out.printf("!%b = %b\n", true, !true);
		
		// 점수가 80점 이상이면서 90점 이하면 true, 아니면 false 출력( 이면서, 그리고 ~이고)
		int number = 80;
		boolean result = number >=80 && number <= 90;
		// result = 80 <= number <= 90 X 오류
		System.out.printf("result = %b\n", result);
		
		// 점수가 100이상이거나 50미만이면 true, 아니면 false( 이거나, 또는)
		number = 150;
		result = number >= 100 || number < 50;
		// result = 100 >= number < 50 X 오류
		System.out.printf("result = %b\n", result);
		
		int kor = 88, eng = 78, mat = 95;
		double avg;
		// 평균이 80이상이면서 영어 점수가 75점 이상이면 true 출력, 아니면 false 출력
		avg = (kor + eng + mat) / 3.0;
		result = avg >= 80 && eng >= 75;
		System.out.printf("result = %b\n", result);
	}
}
