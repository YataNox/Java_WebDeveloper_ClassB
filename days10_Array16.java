package days10;

public class Array16 
{
	public static void main(String[] args)
	{
		// 1차원 배열의 복사
		int[] a = {1,2,3,4,5};
		int[] b;
		b = a; // b배열은 a의 주소를 복사
		
		for(int k : a)
			System.out.printf("%d ", k);
		System.out.println();
		
		for(int k : b)
			System.out.printf("%d ", k);
		System.out.println();
		
		a[2] = 100;
		for(int k : a)
			System.out.printf("%d ", k);
		System.out.println();
		
		for(int k : b)
			System.out.printf("%d ", k);
	}
}
