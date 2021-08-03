package days11;

public class Method13 
{
	public static void main(String[] args)
	{
		// 전달인수의 개수가 일정치 않아서 오버로딩으로는 해결할 수 없을 때
		int c;
		c = max(50, 60, 80, 60, 54, 60);
		System.out.println("입력한 값 중 큰 값은 : " + c + "입니다.");
		c = max(50, 60, 80, 60, 54, 60, 56, 87, 69);
		System.out.println("입력한 값 중 큰 값은 : " + c + "입니다.");
	}
	public static int max(int... a)
	{
		int max = a[0];
		// 참조변수 a를 이름으로 한 배열이 생성됩니다.
		for(int i = 1; i < a.length; i++)
			if(max < a[i])
				max = a[i];
		
		return max;
	}
}
