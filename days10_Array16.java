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
		// 레퍼런스 변수간의 값의 복사로는 배열의 복사까지 이루어지지 않습니다.
		// 위의 동작 b = a;는 a가 갖고 있는 참조값(주소)를 b 변수에 복사한 것이므로
		// 배열 공간은 하나, 그 배열 주소를 저장한 변수는 두 개로 설정한 것과 같습니다.
		// 따라서 a[2]값 변경은 b[2]값 변경과 같습니다.
	}
}
