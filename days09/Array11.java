package days09;

public class Array11 
{
	public static void main(String[] args)
	{
		// 배열 a, b, c 생성( 각 갯수 10개)
		// a 배열에는 3의 배수들 10개 저장 - 반복 실행문 이용
		// b 배열에는 5의 배수들 10개 저장 - 반복 실행문 이용
		// c 배열에는 a와 b배열의 각 같은 인덱스 값들의 합을 저장 - 반복 실행문 이용
		// ex) c[3] = a[3] + b[3];
		// 출력
		// a 배열 -> 3,6,9,12,15
		// a 배열 -> 5,10,15,20,25
		// a 배열 -> 8,16,24,32,40
		
		int [] a = new int [10], b = new int [10], c = new int [10];
		
		for(int i = 0; i < c.length; i++)
		{
			a[i] = 3 * (i+1);
			b[i] = 5 * (i+1);
			c[i] = a[i] + b[i];
		}
		
		System.out.print("a배열 -> ");
		for(int i = 0; i < a.length-1; i++)
			System.out.printf("%d, ", a[i]);
		System.out.println(a[a.length-1]);
		/*
		 * for(int i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		 */
		
		System.out.print("b배열 -> ");
		for(int i = 0; i < b.length-1; i++)
			System.out.printf("%d, ", b[i]);
		System.out.println(b[b.length-1]);
		
		System.out.print("c배열 -> ");
		for(int i = 0; i < c.length-1; i++)
			System.out.printf("%d, ", c[i]);
		System.out.println(c[c.length-1]);
	}
}
