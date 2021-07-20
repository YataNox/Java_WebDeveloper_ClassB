package days04;

public class Operator03 
{

	public static void main(String[] args)
	{
		// 관계연산자
		// 좌항 기준
		// >(초과), <(미만), >=(이상), <=(이하), ==(같다), !=(같지 않다)
		// 좌항과 우하으이 크기를 비교하여 true/false 값이 결과가 되는 연산
		// 관계식이 올바른 경우 true, 관계식이 틀린 경우 false가 연산의 결과가 됩니다.
		int n1 = 10;
		int n2 = 5;
		boolean result;
		
		// %b : printf에서 boolean 타입의 값을 출력하는 이스케이프 문자
		result = n1 > n2;
		System.out.printf("%d > %d -> %b\n", n1, n2, result);
		result = n1 < n2;
		System.out.printf("%d < %d -> %b\n", n1, n2, result);
		result = n1 >= n2;
		System.out.printf("%d >= %d -> %b\n", n1, n2, result);
		result = n1 <= n2;
		System.out.printf("%d <= %d -> %b\n", n1, n2, result);
		result = n1 == n2;
		System.out.printf("%d == %d -> %b\n", n1, n2, result);
		result = n1 != n2;
		System.out.printf("%d != %d -> %b\n", n1, n2, result);
		
	}
}
