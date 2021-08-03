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
		/*int[] list = {a, b, c};
		int max = list[0];
		for(int i = 0; i < list.length; i++)
		{
			if(max < list[i])
				max = list[i];
		}*/
		int mv;
		if(a > b)
			mv = a;
		else
			mv = b;
		if(mv > c)
			return mv;
		else
			return c;
	}
	
	// 메소드 사용에 따른 메소드 형태
	// abc() - 전달 인수 없고 리턴 값도 없는 형태
	// abc(10, 20) - 전달인수 2개, 리턴값 없음
	// k = abc() - 전달인수 없고, 리턴 값 있는 형태
	// k = abc(10, 20) - 전달인수 2개, 리턴 값 있음
	
	// ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※
	// 개발자 필요에 의해 만들어지는 메소드는 반드시 클래스 안에 정의되어야 하며
	// 생성된 메소드들 간에는 자유롭게 서로를 호출하여 사용할 수 있습니다.
	// 그들은 그들을 둘러싼 클래스에 속해 있는 멤버들이라고도 부릅니다.
	// main 메서드는 제외 - main을 호출한다는건 프로그램을 시작한다는 뜻
	// ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※
}
