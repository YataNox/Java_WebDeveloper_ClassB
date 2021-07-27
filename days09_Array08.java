package days09;

import java.util.Random;

public class Array08 
{
	public static void main(String[] args)
	{
		int[] a = new int[6];
		int t;
		
		Random rd = new Random();
		
		a[0] = rd.nextInt(); // Int 범위내 랜덤 값 생성
		
		if(a[0] < 0) // 음수일 경우 양수로 변환
			a[0] *= -1;
		
		// 랜덤 값 1~45범위로 조정, 출력
		a[0] = a[0] % 45 + 1; // a[0] = (rd.nextInt() * 45) + 1;
		System.out.printf("%d ", a[0]);
		System.out.println();
		
		// 6개의 랜덤 값 생성
		for(int i = 0; i < a.length; i++)
		{
			a[i] = rd.nextInt();
	
			if(a[i] < 0)
				a[i] *= -1;
			
			a[i] = a[i] % 45 + 1; // a[i] = (rd.nextInt() * 45) + 1;
			// 중복 검사
			int j;
			for(j = 0; j < i; j++)
				if(a[j] == a[i]) // 중복이 나왔을 때
					break;
			if(i == j) // 그 중복이 현재 작성한 마지막 숫자일 경우 그냥 계속 진행
				continue;
			else if (i != j) // 아닐 경우 이전 숫자 재생성
				i--;
		}
		
		// 오름차순 정렬
		for(int i = 0; i < a.length; i++)
			for(int j = i+1; j < a.length; j++)
				if(a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
		
		// 출력
		for(int i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		
	}
}
