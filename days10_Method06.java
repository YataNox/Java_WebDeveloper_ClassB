package days10;
// 리턴 값이 존재하는 메소드의 선언
// 메서드 호출 후 메서드에서 계산되어 진 결과를 호출한 지점에서 사용하고자 할 때
// return 명령으로 호출된 지점으로 전달할 수 있습니다.
public class Method06 
{
	public static void main(String[] args)
	{
		int num = 77;
		int k  = squar(5);
		System.out.printf("%d의 제곱은 %d입니다.\n", num, k);
		
		int max_result = max(10, 5, 17);
		// 리턴 값은 메서드 호출 명령 대신 왼쪽 변수에 저장되도록 위치하게 됩니다.
		System.out.printf("가장 큰 숫자는? : %d\n", max_result);
	}
	
	// 5 -> n, n*n -> s, s-> k
	// 리턴 값의 타입이 선언된 메소드는 실행의 결과를 호출한 지점으로 반환할 수 있습니다.
	// 리턴 값이 있는 메서드 생성시 void를 썻던 자리에 리턴 값의 자료형을 써줍니다.
	public static int squar(int n)
	{
		int s = n*n;
		// System.out.printf("%d의 제곱은 %d 입니다.\n", n, s);
		return s;
	}
	// 메소드의 실행 결과를 호출한 지점으로 반환하기 위해서 사용되는 return 키워드
	// return 키워드의 우항에 값 또는 변수 또는 수식이 존재하는 경우
	// 우항의 값 또는 실행 결과를 메소드를 호출한 지점으로 반환(리턴)
	public static int max(int a, int b, int c)
	{
		int[] list = {a, b, c};
		int max = list[0];
		for(int i = 0; i < list.length; i++)
		{
			if(max < list[i])
				max = list[i];
		}
		return max;
	}
}
