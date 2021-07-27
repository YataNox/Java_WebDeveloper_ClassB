package days09;

public class Array07 
{
	public static void main(String[] args)
	{
		// 배열에 있는 값들 중 최대값과 최소값을 찾아서 출력하세요.
		int [] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
		// 지금까지 나왔던 숫자 중 가장 큰 값과 작은 값을 저장할 변수
		int max = a[0], min = a[0]; 
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max) // 최대 값 저장
				max = a[i]
						;
			if(min > a[i]) // 최소 값 저장
				min = a[i];
		}
		
		System.out.printf("최대 값 : %d, 최소 값 : %d", max, min);
	}
}
