package days03;

public class Variable06 
{
	// 단위 : Byte
	// 정수형 : byte(1), short(2), int(4 - 기본형), long(8)
	// 실수형 : float(4), double(8 - 기본형)
	// 문자형 : char(2 - 유니코드 지원)
	// 진위형 : boolean(1 - true/false의 값만 저장할 수 있음)
	// 문자열 : String(클래스, 정해진 크기가 없음)
	public static void main(String[] args) 
	{
		// 변수의 다양한 선언 방법
		
		// 1. 변수의 선언 후, 값을 할당
		int n1;
		n1 = 10;
		// 2. 변수의 선언과 값의 대입을 동시에 처리
		int n2 = 20;
		// 3. 다수개의 변수를 한 번에 선언하는 방법(동일한 자료형만 가능)
		int n3, n4, n5;
		// 4. 다수개의 변수를 값을 대입하면서 생성하는 방법
		int n6 = 60, n7 = 70;
		// 5. 처음부터 모든 변수에 값을 대입할 필요는 없음
		int n8, n9 = 90, n10;
		
		// 변수의 선언 위치
		// 변수의 사용 전이라면 위치에 관계없이 변수를 선언할 수 잇음
		int v1 = 10;
		System.out.println("프로그램 시작 v1변수의 값 : " + v1);
		
		// System.out.printf("v3 변수의 값 %d\n", v3); // 오류
		// v3 변수 생성 명령이 앞단에 없으므로 위 명령은 오류
		
		int v3 = 30;
		// v3 변수가 생성되었으므로 아래 코드는 정상 실행
		System.out.printf("v3 변수의 값 %d\n", v3);

		//변수는 선언 이후라도 값이 대입되지 않으면 사용이 불가합니다.
		int v4;
		//System.out.printf("v4 변수의 값 %d\n", v4); // 오류
	}
}
